package AlkeWalletM5.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Moneda")
public class Moneda {
    private String divisaId;
    private String divisaNombre;
    private String divisaSimbolo;

    public String getDivisaId() {
        return divisaId;
    }

    public void setDivisaId(String divisaId) {
        this.divisaId = divisaId;
    }

    public String getDivisaNombre() {
        return divisaNombre;
    }

    public void setDivisaNombre(String divisaNombre) {
        this.divisaNombre = divisaNombre;
    }

    public String getDivisaSimbolo() {
        return divisaSimbolo;
    }

    public void setDivisaSimbolo(String divisaSimbolo) {
        this.divisaSimbolo = divisaSimbolo;
    }
}
