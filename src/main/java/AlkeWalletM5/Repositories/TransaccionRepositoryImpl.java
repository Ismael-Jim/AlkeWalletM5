package AlkeWalletM5.Repositories;

import AlkeWalletM5.Util.ConexionBaseDatos;
import AlkeWalletM5.models.Transaccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TransaccionRepositoryImpl implements TransaccionRepository {

    @Override
    public void saveTransaccion(Transaccion transaccion) {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            String sql = "INSERT INTO TRANSACCION (transaccion_id, remitente_usuario_id, receptor_usuario_id, importe, fecha_transaccion, divisa_id) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, transaccion.getTransaccionId());
            stmt.setString(2, transaccion.getRemitenteUsuarioId());
            stmt.setString(3, transaccion.getReceptorUsuarioId());
            stmt.setInt(4, transaccion.getImporte());
            stmt.setDate(5, new java.sql.Date(transaccion.getFechaTransaccion().getTime()));
            stmt.setString(6, transaccion.getDivisaId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Transaccion> getTransaccionesByUsuarioId(String usuarioId) {
        List<Transaccion> transacciones = new ArrayList<>();
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            String sql = "SELECT * FROM TRANSACCION WHERE remitente_usuario_id = ? OR receptor_usuario_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioId);
            stmt.setString(2, usuarioId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Transaccion transaccion = new Transaccion();
                transaccion.setTransaccionId();
                transaccion.setRemitenteUsuarioId(rs.getString("remitente_usuario_id"));
                transaccion.setReceptorUsuarioId(rs.getString("receptor_usuario_id"));
                transaccion.setImporte(rs.getInt("importe"));
                transaccion.setFechaTransaccion(rs.getDate("fecha_transaccion"));
                transaccion.setDivisaId(rs.getString("divisa_id"));
                transacciones.add(transaccion);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transacciones;
    }
}