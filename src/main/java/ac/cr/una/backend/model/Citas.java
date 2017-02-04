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
@Table(name = "citas", catalog = "proyecto2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "idCita")})
public class Citas {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idCita", unique = true, nullable = false)
    private int idCita;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idPaciente", nullable = false)
    private Pacientes idPaciente;
    @Column(name = "dia", unique = false, nullable = false)
    private String dia;
    @Column(name = "hora", unique = false, nullable = false)
    private String hora;
    @Column(name = "consultorio", unique = false, nullable = false)
    private String consultorio;

    /**
     *
     */
    public Citas() {
    }

    /**
     *
     * @param idCita
     * @param idPaciente
     * @param dia
     * @param hora
     * @param consultorio
     */
    public Citas(int idCita, Pacientes idPaciente, String dia, String hora, String consultorio) {
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.dia = dia;
        this.hora = hora;
        this.consultorio = consultorio;
    }

    /**
     *
     * @return
     */
    public int getIdCita() {
        return idCita;
    }

    /**
     *
     * @param idCita
     */
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    /**
     *
     * @return
     */
    public Pacientes getIdPaciente() {
        return idPaciente;
    }

    /**
     *
     * @param idPaciente
     */
    public void setIdPaciente(Pacientes idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     *
     * @return
     */
    public String getDia() {
        return dia;
    }

    /**
     *
     * @param dia
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     *
     * @return
     */
    public String getHora() {
        return hora;
    }

    /**
     *
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     *
     * @return
     */
    public String getConsultorio() {
        return consultorio;
    }

    /**
     *
     * @param consultorio
     */
    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idCita;
        hash = 67 * hash + Objects.hashCode(this.idPaciente);
        hash = 67 * hash + Objects.hashCode(this.dia);
        hash = 67 * hash + Objects.hashCode(this.hora);
        hash = 67 * hash + Objects.hashCode(this.consultorio);
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
        final Citas other = (Citas) obj;
        if (this.idCita != other.idCita) {
            return false;
        }
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        if (!Objects.equals(this.consultorio, other.consultorio)) {
            return false;
        }
        if (!Objects.equals(this.idPaciente, other.idPaciente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Citas{" + "idCita=" + idCita + ", idPaciente=" + idPaciente + ", dia=" + dia + ", hora=" + hora + ", consultorio=" + consultorio + '}';
    }

    
    
    
}
