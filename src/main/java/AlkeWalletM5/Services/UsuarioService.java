package AlkeWalletM5.Services;

import AlkeWalletM5.models.Usuario;

public interface UsuarioService {
    Usuario login(String correo, String password);

    Usuario getUsuarioById(String usuarioId);
    void depositarFondos(String usuarioId, int cantidad);
    void retirarFondos(String usuarioId, int cantidad);
}