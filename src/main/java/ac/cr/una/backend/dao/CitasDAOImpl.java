
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Citas;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Gabo Quesada
 */

public class CitasDAOImpl implements CitasDAO{
    
private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public Citas createCita(Citas cita) {
       session.beginTransaction();
        session.save(cita);
        session.getTransaction().commit();
        return cita;
    }

    @Override
    public List<Citas> getAllCitas() {
     
        List<Citas> pacienteList = new ArrayList<>();

        pacienteList = session.createCriteria(Citas.class).list();

        return pacienteList;
    }

    @Override
    public List<Citas> getAllVitasById(int id) {
     
          List<Citas> infoList = new ArrayList<>();
        infoList = session.createCriteria(Citas.class).list();

        List<Citas> lista = new ArrayList<>();
        int tam = infoList.size();

        for (int i = 0; i < tam; i++) {

            if (infoList.get(i).getIdPaciente().getIdPacientes() == id) {
                lista.add(infoList.get(i));
            }

        }

        return lista; 
    }

    @Override
    public Citas update(Citas citas) {
    
        session.beginTransaction();
        session.update(citas);
        session.getTransaction().commit();

        return citas;
    }
}
