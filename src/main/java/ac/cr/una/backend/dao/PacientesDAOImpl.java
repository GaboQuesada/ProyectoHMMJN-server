package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Pacientes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Gabo Quesada
 */
public class PacientesDAOImpl implements PacientesDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public Pacientes PacientesCreate(Pacientes pacientes) {
        session.beginTransaction();
        session.save(pacientes);
        session.getTransaction().commit();

        return pacientes;
    }

    @Override
    public List<Pacientes> PacientesGetAll() {
        List<Pacientes> pacienteList = new ArrayList<>();

        pacienteList = session.createCriteria(Pacientes.class).list();

        return pacienteList;
    }

    @Override
    public Pacientes PacientesByname(String name) {
        Pacientes usuario = null;
        Query query = session.createQuery("from Pacientes where name = :name ");
        query.setParameter("name", name);

        if (query.list().size() > 0) {
            usuario = (Pacientes) query.list().get(0);
        }

        return usuario;
    }

    @Override
    public Pacientes PacientesById(int idpacientes) {
        Pacientes usuario = null;
        Query query = session.createQuery("from Pacientes where idpacientes = :idpacientes");
        query.setParameter("idpacientes", idpacientes);

        if (query.list().size() > 0) {
            usuario = (Pacientes) query.list().get(0);
        }

        return usuario;
    }

    @Override
    public Pacientes PacientesUpdate(Pacientes pacientes) {
        session.beginTransaction();
        session.update( pacientes);
        session.getTransaction().commit();

        return  pacientes;
    }

    @Override
    public boolean PacientesDeleted(int idpacientes) {
        
        boolean resultado = false;
        
        Pacientes student = null;
        session.beginTransaction();
        student = (Pacientes) session.get(Pacientes.class,idpacientes);
        session.delete(student);
        session.getTransaction().commit();
        resultado= true;
        return resultado;
    }

    @Override
    public boolean PacientesDeleteAll() {
 session.beginTransaction();
 boolean resultado = false;
        Collection Usuario = session.createCriteria(Pacientes.class).list();

        for (Iterator i = Usuario.iterator(); i.hasNext();) {
            session.beginTransaction();
            Pacientes book = (Pacientes) i.next();
            session.delete(book);
            session.getTransaction().commit();

        }

       resultado= true;
        return resultado;
    }
}
