package AlkeWalletM5.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Transaccion")


public class Transaccion {
    private String transaccionId;
    private String remitenteUsuarioId;
    private String receptorUsuarioId;
    private int importe;
    private Date fechaTransaccion;
    private String divisaId;

    public String getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId() {
        this.transaccionId = transaccionId;
    }

    public String getRemitenteUsuarioId() {
        return remitenteUsuarioId;
    }

    public void setRemitenteUsuarioId(String remitenteUsuarioId) {
        this.remitenteUsuarioId = remitenteUsuarioId;
    }

    public String getReceptorUsuarioId() {
        return receptorUsuarioId;
    }

    public void setReceptorUsuarioId(String receptorUsuarioId) {
        this.receptorUsuarioId = receptorUsuarioId;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getDivisaId() {
        return divisaId;
    }

    public void setDivisaId(String divisaId) {
        this.divisaId = divisaId;
    }
}



