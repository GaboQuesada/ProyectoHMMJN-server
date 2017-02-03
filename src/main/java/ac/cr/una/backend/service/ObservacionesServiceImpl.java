
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.ObservacionesDAO;
import ac.cr.una.backend.model.Observaciones;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public class ObservacionesServiceImpl implements ObservacionesService {
    
    private ObservacionesDAO observacionesDAO;

    public ObservacionesServiceImpl() {
    }

    public ObservacionesServiceImpl(ObservacionesDAO observacionesDAO) {
        this.observacionesDAO = observacionesDAO;
    }

    public ObservacionesDAO getObservacionesDAO() {
        return observacionesDAO;
    }

    public void setObservacionesDAO(ObservacionesDAO observacionesDAO) {
        this.observacionesDAO = observacionesDAO;
    }

    @Override
    public List<Observaciones> getObservacionesByid(int id) {
     return observacionesDAO.getObservacionesByid(id);
    }

    @Override
    public Observaciones createObservaciones(Observaciones observaciones) {
  return observacionesDAO.createObservaciones(observaciones);
    }

    @Override
    public Observaciones UpdateObservaciones(Observaciones observaciones) {
        return observacionesDAO.UpdateObservaciones(observaciones);
    }
    
    
    
}
