
package AlkeWalletM5.Repositories;

import AlkeWalletM5.models.Moneda;
import AlkeWalletM5.Util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MonedaRepositoryImpl implements MonedaRepository {

    @Override
    public Optional<Moneda> getMonedaById(String divisaId) {
        Moneda moneda = null;
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            String sql = "SELECT * FROM MONEDA WHERE divisa_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, divisaId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                moneda = new Moneda();
                moneda.setDivisaId(rs.getString("divisa_id"));
                moneda.setDivisaNombre(rs.getString("divisa_nombre"));
                moneda.setDivisaSimbolo(rs.getString("divisa_simbolo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(moneda);
    }

    @Override
    public List<Moneda> getAllMonedas() {
        List<Moneda> monedas = new ArrayList<>();
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            String sql = "SELECT * FROM MONEDA";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Moneda moneda = new Moneda();
                moneda.setDivisaId(rs.getString("divisa_id"));
                moneda.setDivisaNombre(rs.getString("divisa_nombre"));
                moneda.setDivisaSimbolo(rs.getString("divisa_simbolo"));
                monedas.add(moneda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return monedas;
    }
}
