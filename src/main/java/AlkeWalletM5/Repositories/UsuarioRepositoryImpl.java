package AlkeWalletM5.Repositories;

import AlkeWalletM5.models.Usuario;
import AlkeWalletM5.Util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

public class UsuarioRepositoryImpl implements UsuarioRepository {
    @Override
    public Usuario findByCorreoAndPassword(String correo, String password) {
        Usuario usuario = null;
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            String sql = "SELECT * FROM USUARIO WHERE correo = ? AND contrasena = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, correo);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setUsuarioId(rs.getString("usuario_id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setSaldo(rs.getInt("saldo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public Optional<Usuario> getUsuarioById(String usuarioId) {
        Usuario usuario = null;
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            String sql = "SELECT * FROM USUARIO WHERE usuario_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setUsuarioId(rs.getString("usuario_id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContrasena(rs.getString("contrasena"));
                usuario.setSaldo(rs.getInt("saldo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(usuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            String sql = "UPDATE USUARIO SET nombre = ?, correo = ?, contrasena = ?, saldo = ? WHERE usuario_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getCorreo());
            stmt.setString(3, usuario.getContrasena());
            stmt.setInt(4, usuario.getSaldo());
            stmt.setString(5, usuario.getUsuarioId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}