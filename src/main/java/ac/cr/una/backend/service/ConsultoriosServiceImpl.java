
package ac.cr.una.backend.service;

import ac.cr.una.backend.service.ConsultoriosService;
import ac.cr.una.backend.dao.ConsultoriosDAO;
import ac.cr.una.backend.model.Consultorios;
import java.util.List;

/**
 *
 * @author Gabo Quesada
 */


public class ConsultoriosServiceImpl implements ConsultoriosService {
  
    private ConsultoriosDAO conColnsultoriosDAO;

    public ConsultoriosServiceImpl() {
    }

    public ConsultoriosServiceImpl(ConsultoriosDAO conColnsultoriosDAO) {
        this.conColnsultoriosDAO = conColnsultoriosDAO;
    }

    public ConsultoriosDAO getConColnsultoriosDAO() {
        return conColnsultoriosDAO;
    }

    public void setConColnsultoriosDAO(ConsultoriosDAO conColnsultoriosDAO) {
        this.conColnsultoriosDAO = conColnsultoriosDAO;
    }

    @Override
    public List<Consultorios> getConsultoriosByid() {
       return conColnsultoriosDAO.getConsultoriosByid();
               
    }
    
    
}
