package Modelo.DTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "madera", schema = "ventas", catalog = "")
public class Madera_Bean {
    @GeneratedValue (strategy =GenerationType.AUTO)
    private Integer codigo;
    private String nombreMadera;
    private Long precio;
    private Long stock;

    public Madera_Bean(int codigo, String nombreMadera, Long precio, Long stock) {
        this.codigo=codigo;
        this.nombreMadera = nombreMadera;
        this.precio = precio;
        this.stock = stock;
    }

    public Madera_Bean() {

    }

    @Id
    @Column(name = "codigo", nullable = false)
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "nombre_madera", nullable = false, length = 10)
    public String getNombreMadera() {
        return nombreMadera;
    }

    public void setNombreMadera(String nombreMadera) {
        this.nombreMadera = nombreMadera;
    }

    @Basic
    @Column(name = "precio", nullable = true)
    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "Stock", nullable = true)
    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Madera_Bean that = (Madera_Bean) o;
        return Objects.equals(codigo, that.codigo) &&
                Objects.equals(nombreMadera, that.nombreMadera) &&
                Objects.equals(precio, that.precio) &&
                Objects.equals(stock, that.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombreMadera, precio, stock);
    }
}
