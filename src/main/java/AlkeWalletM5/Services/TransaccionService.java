package AlkeWalletM5.Services;

import AlkeWalletM5.models.Transaccion;
import java.util.List;

public interface TransaccionService {
    void saveTransaccion(Transaccion transaccion);
    List<Transaccion> getTransaccionesByUsuarioId(String usuarioId);
}