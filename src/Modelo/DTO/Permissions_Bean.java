package Modelo.DTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "permissions", schema = "ventas", catalog = "")
public class Permissions_Bean {
    @GeneratedValue (strategy =GenerationType.AUTO)
    private int id;
    private String user;
    private String password;

    public Permissions_Bean(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Permissions_Bean() {

    }

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "User", nullable = false, length = 20)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "Password", nullable = false, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permissions_Bean that = (Permissions_Bean) o;
        return id == that.id &&
                Objects.equals(user, that.user) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, password);
    }
}
