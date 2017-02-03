
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Consultorios;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Gabo Quesada
 */


public class ConsultorioDAOImpl implements ConsultoriosDAO {
     private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<Consultorios> getConsultoriosByid() {
     
       List<Consultorios> pacienteList = new ArrayList<>();

        pacienteList = session.createCriteria(Consultorios.class).list();

        return pacienteList;
    }

 
}
