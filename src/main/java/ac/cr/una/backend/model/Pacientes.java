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
@Table(name = "pacientes", catalog = "proyecto2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "idPacientes")})
public class Pacientes implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idPacientes", unique = true, nullable = false)
    private int idPacientes;
    @Column(name = "name", unique = false, nullable = false)
    private String name;
    @Column(name = "telefono", unique = false, nullable = false)
    private String telefono;
    @Column(name = "direccion", unique = false, nullable = false)
    private String direccion;
    @Column(name = "fechanacimiento", unique = false, nullable = false)
    private String fechanacimiento;

    /**
     *
     */
    public Pacientes() {
    }

    /**
     *
     * @param idPacientes
     * @param name
     * @param telefono
     * @param direccion
     * @param fechanacimiento
     */
    public Pacientes(int idPacientes, String name, String telefono, String direccion, String fechanacimiento) {
        this.idPacientes = idPacientes;
        this.name = name;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechanacimiento = fechanacimiento;
    }

    /**
     *
     * @return
     */
    public int getIdPacientes() {
        return idPacientes;
    }

    /**
     *
     * @param idPacientes
     */
    public void setIdPacientes(int idPacientes) {
        this.idPacientes = idPacientes;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public String getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     *
     * @param fechanacimiento
     */
    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.idPacientes;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.telefono);
        hash = 19 * hash + Objects.hashCode(this.direccion);
        hash = 19 * hash + Objects.hashCode(this.fechanacimiento);
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
        final Pacientes other = (Pacientes) obj;
        if (this.idPacientes != other.idPacientes) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.fechanacimiento, other.fechanacimiento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "idPacientes=" + idPacientes + ", name=" + name + ", telefono=" + telefono + ", direccion=" + direccion + ", fechanacimiento=" + fechanacimiento + '}';
    }

}
