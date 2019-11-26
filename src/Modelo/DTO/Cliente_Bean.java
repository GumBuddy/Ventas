package Modelo.DTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cliente", schema = "ventas", catalog = "ventas")
public class Cliente_Bean {
    @GeneratedValue (strategy =GenerationType.AUTO)
    private Integer idCliente;
    private String name;
    private String state;

    public Cliente_Bean(Integer idCliente, String name, String state) {
        this.idCliente=idCliente;
        this.name = name;
        this.state = state;
    }

    public Cliente_Bean() {

    }

    @Id
    @Column(name = "id_cliente", nullable = false)
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 30)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente_Bean that = (Cliente_Bean) o;
        return Objects.equals(idCliente, that.idCliente) &&
                Objects.equals(name, that.name) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, name, state);
    }
}
