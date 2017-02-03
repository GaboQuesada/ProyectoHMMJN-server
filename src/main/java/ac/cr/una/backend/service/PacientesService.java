package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Pacientes;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */
public interface PacientesService {

    public Pacientes PacientesCreate(Pacientes pacientes);

    public List<Pacientes> PacientesGetAll();

    public Pacientes PacientesByname(String name);

    public Pacientes PacientesById(int idpacientes);

    public Pacientes PacientesUpdate(Pacientes pacientes);

    public boolean PacientesDeleted(int idpacientes);

    public boolean PacientesDeleteAll();
}
