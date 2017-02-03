
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.EnfermedadesDAO;
import ac.cr.una.backend.model.Enfermedades;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public class EnfermedadesServiceImpl implements EnfermedadesService{
    
    private EnfermedadesDAO enfermedadesDAO;

    public EnfermedadesServiceImpl() {
    }

    public EnfermedadesServiceImpl(EnfermedadesDAO enfermedadesDAO) {
        this.enfermedadesDAO = enfermedadesDAO;
    }

    public EnfermedadesDAO getEnfermedadesDAO() {
        return enfermedadesDAO;
    }

    public void setEnfermedadesDAO(EnfermedadesDAO enfermedadesDAO) {
        this.enfermedadesDAO = enfermedadesDAO;
    }

    @Override
    public List<Enfermedades> getObservacionesByid(int id) {
        return enfermedadesDAO.getObservacionesByid(id);
    }

    @Override
    public Enfermedades createEnfermedades(Enfermedades observaciones) {
      return enfermedadesDAO.createEnfermedades(observaciones);
    }

    @Override
    public Enfermedades UpdateEnfermedades(Enfermedades observaciones) {
       return enfermedadesDAO.UpdateEnfermedades(observaciones);
    }
    
    
}
