
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.PacientesDAO;
import ac.cr.una.backend.model.Pacientes;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public class PacientesServiceImpl implements PacientesService{
    
    
    private PacientesDAO pacientesDAO;

    public PacientesServiceImpl() {
    }

    public PacientesServiceImpl(PacientesDAO pacientesDAO) {
        this.pacientesDAO = pacientesDAO;
    }

    public PacientesDAO getPacientesDAO() {
        return pacientesDAO;
    }

    public void setPacientesDAO(PacientesDAO pacientesDAO) {
        this.pacientesDAO = pacientesDAO;
    }

    @Override
    public Pacientes PacientesCreate(Pacientes pacientes) {
       return pacientesDAO.PacientesCreate(pacientes);
    }

    @Override
    public List<Pacientes> PacientesGetAll() {
        return pacientesDAO.PacientesGetAll();
    }

    @Override
    public Pacientes PacientesByname(String name) {
   return pacientesDAO.PacientesByname(name);
    }

    @Override
    public Pacientes PacientesById(int idpacientes) {
  return pacientesDAO.PacientesById(idpacientes);
    }

    @Override
    public Pacientes PacientesUpdate(Pacientes pacientes) {
        return pacientesDAO.PacientesUpdate(pacientes);
    }

    @Override
    public boolean PacientesDeleted(int idpacientes) {
        return pacientesDAO.PacientesDeleted(idpacientes);
    }

    @Override
    public boolean PacientesDeleteAll() {
      return pacientesDAO.PacientesDeleteAll();
    }
    
    
}
