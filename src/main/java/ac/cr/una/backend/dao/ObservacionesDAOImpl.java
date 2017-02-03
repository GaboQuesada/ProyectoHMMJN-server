package ac.cr.una.backend.dao;


import ac.cr.una.backend.model.Observaciones;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Gabo Quesada
 */
public class ObservacionesDAOImpl implements ObservacionesDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<Observaciones> getObservacionesByid(int id) {
        List<Observaciones> infoList = new ArrayList<>();
        infoList = session.createCriteria(Observaciones.class).list();

        List<Observaciones> lista = new ArrayList<>();
        int tam = infoList.size();

        for (int i = 0; i < tam; i++) {

            if (infoList.get(i).getIdPacientes().getIdPacientes() == id) {
                lista.add(infoList.get(i));
            }

        }

        return lista;
    }

    @Override
    public Observaciones createObservaciones(Observaciones observaciones) {
        session.beginTransaction();
        session.save(observaciones);
        session.getTransaction().commit();
        return observaciones;
    }

    @Override
    public Observaciones UpdateObservaciones(Observaciones observaciones) {
        session.beginTransaction();
        session.update(observaciones);
        session.getTransaction().commit();

        return observaciones;
    }

}
