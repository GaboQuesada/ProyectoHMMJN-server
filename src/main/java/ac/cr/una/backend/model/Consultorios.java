
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
@Table(name = "consultorios", catalog = "proyecto2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "idConsultorio")})
public class Consultorios implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idConsultorio", unique = true, nullable = false)
    private int idConsultorio;
    @Column(name = "telefono", unique = false, nullable = false)
    private String telefono;
    @Column(name = "fechayhora", unique = false, nullable = false)
    private String fechayhora;
     @Column(name = "name", unique = false, nullable = false)
    private String name;

    public Consultorios() {
    }

    public Consultorios(int idConsultorio, String telefono, String fechayhora, String name) {
        this.idConsultorio = idConsultorio;
        this.telefono = telefono;
        this.fechayhora = fechayhora;
        this.name = name;
    }

    public int getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(int idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(String fechayhora) {
        this.fechayhora = fechayhora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idConsultorio;
        hash = 79 * hash + Objects.hashCode(this.telefono);
        hash = 79 * hash + Objects.hashCode(this.fechayhora);
        hash = 79 * hash + Objects.hashCode(this.name);
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
        final Consultorios other = (Consultorios) obj;
        if (this.idConsultorio != other.idConsultorio) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.fechayhora, other.fechayhora)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consultorio{" + "idConsultorio=" + idConsultorio + ", telefono=" + telefono + ", fechayhora=" + fechayhora + ", name=" + name + '}';
    }
     
     
     
}
