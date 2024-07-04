package AlkeWalletM5.Services;

import AlkeWalletM5.Repositories.UsuarioRepository;
import AlkeWalletM5.models.Usuario;

import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario login(String correo, String password) {
        return null;
    }

    @Override
    public Usuario getUsuarioById(String usuarioId) {
        Optional<Usuario> usuario = usuarioRepository.getUsuarioById(usuarioId);
        return usuario.orElse(null);
    }

    @Override
    public void depositarFondos(String usuarioId, int cantidad) {
        Optional<Usuario> usuarioOpt = usuarioRepository.getUsuarioById(usuarioId);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            usuario.depositar(cantidad);
            usuarioRepository.actualizarUsuario(usuario);
        }
    }

    @Override
    public void retirarFondos(String usuarioId, int cantidad) {
        Optional<Usuario> usuarioOpt = usuarioRepository.getUsuarioById(usuarioId);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            if (usuario.getSaldo() >= cantidad) {
                usuario.retirar(cantidad);
                usuarioRepository.actualizarUsuario(usuario);
            } else {
                throw new IllegalArgumentException("Fondos insuficientes");
            }
        }
    }
}