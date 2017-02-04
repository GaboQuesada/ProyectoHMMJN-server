
package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Citas;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public interface CitasService {
    
    public Citas createCita(Citas cita);
    public List<Citas> getAllCitas();
    public List<Citas> getAllVitasById(int id);
    public Citas update(Citas citas);
    
}
