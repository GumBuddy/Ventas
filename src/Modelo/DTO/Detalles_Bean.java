package Modelo.DTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "detalles", schema = "ventas", catalog = "")
public class Detalles_Bean {
    @GeneratedValue (strategy =GenerationType.AUTO)
    private Integer idOrden;
    private Integer total;
    private Orden_Bean ordenByFkIdOrden;
    private Madera_Bean maderaByFkCodigo;

    public Detalles_Bean() {

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
    @Column(name = "total", nullable = false)
    public Integer getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detalles_Bean that = (Detalles_Bean) o;
        return Objects.equals(idOrden, that.idOrden) &&
                Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrden, total);
    }

    @ManyToOne
    @JoinColumn(name = "fk_id_orden", referencedColumnName = "id_orden", nullable = false)
    public Orden_Bean getOrdenByFkIdOrden() {
        return ordenByFkIdOrden;
    }

    public void setOrdenByFkIdOrden(Orden_Bean ordenByFkIdOrden) {
        this.ordenByFkIdOrden = ordenByFkIdOrden;
    }

    @ManyToOne
    @JoinColumn(name = "fk_codigo", referencedColumnName = "codigo", nullable = false)
    public Madera_Bean getMaderaByFkCodigo() {
        return maderaByFkCodigo;
    }

    public void setMaderaByFkCodigo(Madera_Bean maderaByFkCodigo) {
        this.maderaByFkCodigo = maderaByFkCodigo;
    }
}
