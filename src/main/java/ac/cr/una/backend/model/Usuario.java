package ac.cr.una.backend.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Gabo Quesada
 */
@Entity
@Table(name = "usuario", catalog = "proyecto2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "idUsuario")})
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idUsuario", unique = true, nullable = false)
    private int idUsuario;
    @Column(name = "name", unique = false, nullable = false)
    private String name;
    @Column(name = "password", unique = false, nullable = false)
    private String password;

    public Usuario() {
    }

    public Usuario(int idUsuario, String name, String password) {
        this.idUsuario = idUsuario;
        this.name = name;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.idUsuario;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", name=" + name + ", password=" + password + '}';
    }

}
