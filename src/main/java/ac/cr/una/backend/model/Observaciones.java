package ac.cr.una.backend.model;
import ac.cr.una.backend.model.Pacientes;
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
@Table(name = "observaciones", catalog = "proyecto2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "idObservaciones")})
public class Observaciones implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idObservaciones")
    int idObservaciones;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idPacientes", nullable = false)
    Pacientes idPacientes;
    @Column(name = "observacion", unique = false, nullable = false)
    private String observacion;

    /**
     *
     */
    public Observaciones() {
    }

    /**
     *
     * @param idObservaciones
     * @param idPacientes
     * @param observacion
     */
    public Observaciones(int idObservaciones, Pacientes idPacientes, String observacion) {
        this.idObservaciones = idObservaciones;
        this.idPacientes = idPacientes;
        this.observacion = observacion;
    }

    /**
     *
     * @return
     */
    public int getIdObservaciones() {
        return idObservaciones;
    }

    /**
     *
     * @param idObservaciones
     */
    public void setIdObservaciones(int idObservaciones) {
        this.idObservaciones = idObservaciones;
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
    public String getObservacion() {
        return observacion;
    }

    /**
     *
     * @param observacion
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.idObservaciones;
        hash = 11 * hash + Objects.hashCode(this.idPacientes);
        hash = 11 * hash + Objects.hashCode(this.observacion);
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
        final Observaciones other = (Observaciones) obj;
        if (this.idObservaciones != other.idObservaciones) {
            return false;
        }
        if (!Objects.equals(this.observacion, other.observacion)) {
            return false;
        }
        if (!Objects.equals(this.idPacientes, other.idPacientes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Observaciones{" + "idObservaciones=" + idObservaciones + ", idPacientes=" + idPacientes + ", observacion=" + observacion + '}';
    }

}
