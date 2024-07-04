package AlkeWalletM5.Services;

import AlkeWalletM5.models.Moneda;
import java.util.List;

public interface MonedaService {
    Moneda getMonedaById(String divisaId);
    List<Moneda> getAllMonedas();
}
