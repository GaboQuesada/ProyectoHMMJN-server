 
package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Enfermedades;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public interface EnfermedadesService {
     public List<Enfermedades> getObservacionesByid(int id);
   public Enfermedades createEnfermedades(Enfermedades observaciones);
   public Enfermedades UpdateEnfermedades(Enfermedades observaciones); 
}
