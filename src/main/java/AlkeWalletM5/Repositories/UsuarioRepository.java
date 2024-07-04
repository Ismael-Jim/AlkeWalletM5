package AlkeWalletM5.Repositories;

import AlkeWalletM5.models.Usuario;
import java.util.Optional;

public interface UsuarioRepository {
    Usuario findByCorreoAndPassword(String correo, String password);
    Optional<Usuario> getUsuarioById(String usuarioId);
    void actualizarUsuario(Usuario usuario);
}