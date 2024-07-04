package AlkeWalletM5.Repositories;

import AlkeWalletM5.models.Moneda;
import java.util.List;
import java.util.Optional;

public interface MonedaRepository {
    Optional<Moneda> getMonedaById(String divisaId);
    List<Moneda> getAllMonedas();
}