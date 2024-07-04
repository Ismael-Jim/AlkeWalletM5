package AlkeWalletM5.Services;

import AlkeWalletM5.Repositories.TransaccionRepository;
import AlkeWalletM5.models.Transaccion;

import java.util.List;

public class TransaccionServiceImpl implements TransaccionService {

    private TransaccionRepository transaccionRepository;

    public TransaccionServiceImpl(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    @Override
    public void saveTransaccion(Transaccion transaccion) {
        transaccionRepository.saveTransaccion(transaccion);
    }

    @Override
    public List<Transaccion> getTransaccionesByUsuarioId(String usuarioId) {
        return transaccionRepository.getTransaccionesByUsuarioId(usuarioId);
    }
}