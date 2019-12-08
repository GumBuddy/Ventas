package Modelo.DTO;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "orden", schema = "ventas", catalog = "ventas")
public class Orden_Bean {
    @GeneratedValue (strategy =GenerationType.AUTO)
    private Integer idOrden;
    private Date fecha;
    private Cliente_Bean clienteByFkIdCliente;

       public Orden_Bean() {

    }

    @Id
    @Column(name = "id_orden", nullable = false)
    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    @Basic
    @Column(name = "fecha", nullable = false)
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orden_Bean that = (Orden_Bean) o;
        return Objects.equals(idOrden, that.idOrden) &&
                Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrden, fecha);
    }

    @ManyToOne
    @JoinColumn(name = "fk_id_cliente", referencedColumnName = "id_cliente", nullable = false)
    public Cliente_Bean getClienteByFkIdCliente() {
        return clienteByFkIdCliente;
    }

    public void setClienteByFkIdCliente(Cliente_Bean clienteByFkIdCliente) {
        this.clienteByFkIdCliente = clienteByFkIdCliente;
    }
}
