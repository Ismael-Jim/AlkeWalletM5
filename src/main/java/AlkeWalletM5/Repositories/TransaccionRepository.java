package AlkeWalletM5.Repositories;

import AlkeWalletM5.models.Transaccion;
import java.util.List;

public interface TransaccionRepository {
    void saveTransaccion(Transaccion transaccion);
    List<Transaccion> getTransaccionesByUsuarioId(String usuarioId);
}