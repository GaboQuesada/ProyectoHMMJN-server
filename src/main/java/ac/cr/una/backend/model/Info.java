package ac.cr.una.backend.model;

import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Gabo Quesada
 */

@Entity
@Table(name = "info", catalog = "proyecto2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "idinfo")})
public class Info {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idinfo")
    private int idinfo;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario idUsuario;
    @Column(name = "tipo", unique = false, nullable = false)
    private String tipo;
    @Column(name = "contacto", unique = false, nullable = false)
    private String contacto;

    /**
     *
     */
    public Info() {
    }

    public Info(int idinfo, Usuario idUsuario, String tipo, String contacto) {
        this.idinfo = idinfo;
        this.idUsuario = idUsuario;
        this.tipo = tipo;
        this.contacto = contacto;
    }

    public int getIdinfo() {
        return idinfo;
    }

    public void setIdinfo(int idinfo) {
        this.idinfo = idinfo;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.idinfo;
        hash = 13 * hash + Objects.hashCode(this.idUsuario);
        hash = 13 * hash + Objects.hashCode(this.tipo);
        hash = 13 * hash + Objects.hashCode(this.contacto);
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
        final Info other = (Info) obj;
        if (this.idinfo != other.idinfo) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.contacto, other.contacto)) {
            return false;
        }
        if (!Objects.equals(this.idUsuario, other.idUsuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Info{" + "idinfo=" + idinfo + ", idUsuario=" + idUsuario + ", tipo=" + tipo + ", contacto=" + contacto + '}';
    }


    
    
}
