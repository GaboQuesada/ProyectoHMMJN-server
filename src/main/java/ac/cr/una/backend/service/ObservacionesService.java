
package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Observaciones;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public interface ObservacionesService {
    public List<Observaciones> getObservacionesByid(int id);
   public Observaciones createObservaciones(Observaciones observaciones);
   public Observaciones UpdateObservaciones(Observaciones observaciones);
    
}
