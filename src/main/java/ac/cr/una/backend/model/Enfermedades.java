
package ac.cr.una.backend.model;
import java.io.Serializable;
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
@Table(name = "enfermedades", catalog = "proyecto2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "idEnfermedades")})
public class Enfermedades implements Serializable {
    
      @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idEnfermedades")
    int idEnfermedades;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idPacientes", nullable = false)
    Pacientes idPacientes;
    @Column(name = "enfermedad", unique = false, nullable = false)
    private String enfermedad;

    /**
     *
     */
    public Enfermedades() {
    }

    /**
     *
     * @param idEnfermedades
     * @param idPacientes
     * @param enfermedad
     */
    public Enfermedades(int idEnfermedades, Pacientes idPacientes, String enfermedad) {
        this.idEnfermedades = idEnfermedades;
        this.idPacientes = idPacientes;
        this.enfermedad = enfermedad;
    }

    /**
     *
     * @return
     */
    public int getIdEnfermedades() {
        return idEnfermedades;
    }

    /**
     *
     * @param idEnfermedades
     */
    public void setIdEnfermedades(int idEnfermedades) {
        this.idEnfermedades = idEnfermedades;
    }

    /**
     *
     * @return
     */
    public Pacientes getIdPacientes() {
        return idPacientes;
    }

    /**
     *
     * @param idPacientes
     */
    public void setIdPacientes(Pacientes idPacientes) {
        this.idPacientes = idPacientes;
    }

    /**
     *
     * @return
     */
    public String getEnfermedad() {
        return enfermedad;
    }

    /**
     *
     * @param enfermedad
     */
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.idEnfermedades;
        hash = 23 * hash + Objects.hashCode(this.idPacientes);
        hash = 23 * hash + Objects.hashCode(this.enfermedad);
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
        final Enfermedades other = (Enfermedades) obj;
        if (this.idEnfermedades != other.idEnfermedades) {
            return false;
        }
        if (!Objects.equals(this.enfermedad, other.enfermedad)) {
            return false;
        }
        if (!Objects.equals(this.idPacientes, other.idPacientes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enfermedades{" + "idEnfermedades=" + idEnfermedades + ", idPacientes=" + idPacientes + ", enfermedad=" + enfermedad + '}';
    }


}
