package AlkeWalletM5.Services;

import AlkeWalletM5.Repositories.MonedaRepository;
import AlkeWalletM5.models.Moneda;

import java.util.List;
import java.util.Optional;

public class MonedaServiceImpl implements MonedaService {

    private MonedaRepository monedaRepository;

    public MonedaServiceImpl(MonedaRepository monedaRepository) {
        this.monedaRepository = monedaRepository;
    }

    @Override
    public Moneda getMonedaById(String divisaId) {
        Optional<Moneda> moneda = monedaRepository.getMonedaById(divisaId);
        return moneda.orElse(null);
    }

    @Override
    public List<Moneda> getAllMonedas() {
        return monedaRepository.getAllMonedas();
    }
}