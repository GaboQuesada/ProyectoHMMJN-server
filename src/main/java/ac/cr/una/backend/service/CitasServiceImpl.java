 
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.CitasDAO;
import ac.cr.una.backend.model.Citas;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public class CitasServiceImpl implements CitasService {
    
    private CitasDAO citasDAO;

    public CitasServiceImpl() {
    }

    public CitasServiceImpl(CitasDAO citasDAO) {
        this.citasDAO = citasDAO;
    }

    public CitasDAO getCitasDAO() {
        return citasDAO;
    }

    public void setCitasDAO(CitasDAO citasDAO) {
        this.citasDAO = citasDAO;
    }

    @Override
    public Citas createCita(Citas cita) {
       return citasDAO.createCita(cita);
    }

    @Override
    public List<Citas> getAllCitas() {
       return citasDAO.getAllCitas();
    }

    @Override
    public List<Citas> getAllVitasById(int id) {
     return citasDAO.getAllVitasById(id);
    }

    @Override
    public Citas update(Citas citas) {
        return citasDAO.update(citas);
    }
    
    
}
