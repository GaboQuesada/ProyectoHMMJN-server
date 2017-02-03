 
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Enfermedades;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Gabo Quesada
 */


public class EnfermedadesDAOImpl implements EnfermedadesDAO{
    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<Enfermedades> getObservacionesByid(int id) {
      List<Enfermedades> infoList = new ArrayList<>();
        infoList = session.createCriteria(Enfermedades.class).list();

        List<Enfermedades> lista = new ArrayList<>();
        int tam = infoList.size();

        for (int i = 0; i < tam; i++) {

            if (infoList.get(i).getIdPacientes().getIdPacientes() == id) {
                lista.add(infoList.get(i));
            }

        }

        return lista;  
    }

    @Override
    public Enfermedades createEnfermedades(Enfermedades observaciones) {
        session.beginTransaction();
        session.save(observaciones);
        session.getTransaction().commit();
        return observaciones;
    }

    @Override
    public Enfermedades UpdateEnfermedades(Enfermedades observaciones) {
        session.beginTransaction();
        session.update(observaciones);
        session.getTransaction().commit();

        return observaciones;
    }
}
