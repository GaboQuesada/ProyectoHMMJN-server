package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Usuario;
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
public class UsuarioDAOImpl implements UsuarioDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     *
     * @param usuario
     * @return
     */
    @Override
    public Usuario usuarioCreate(Usuario usuario) {
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();

        return usuario;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Usuario> usuarioGetAll() {
        List<Usuario> pacienteList = new ArrayList<>();

        pacienteList = session.createCriteria(Usuario.class).list();

        return pacienteList;
    }

    /**
     *
     * @param name
     * @return
     */
    @Override
    public Usuario usuarioByname(String name) {
        Usuario usuario = null;
        Query query = session.createQuery("from Usuario where name = :name ");
        query.setParameter("name", name);

        if (query.list().size() > 0) {
            usuario = (Usuario) query.list().get(0);
        }

        return usuario;
    }

    /**
     *
     * @param idUsuario
     * @return
     */
    @Override
    public Usuario usuarioById(int idUsuario) {
        Usuario usuario = null;
        Query query = session.createQuery("from Usuario where idUsuario = :idUsuario");
        query.setParameter("idUsuario", idUsuario);

        if (query.list().size() > 0) {
            usuario = (Usuario) query.list().get(0);
        }

        return usuario;
    }

    /**
     *
     * @param usuario
     * @return
     */
    @Override
    public Usuario usuarioUpdate(Usuario usuario) {
        session.beginTransaction();
        session.update(usuario);
        session.getTransaction().commit();

        return usuario;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public String usuarioDeleted(int id) {
          Usuario student = null;

        session.beginTransaction();
        student = (Usuario) session.get(Usuario.class, id);
        session.delete(student);
        session.getTransaction().commit();
        return "Eliminado";
    }

    /**
     *
     * @return
     */
    @Override
    public String usuarioDeleteAll() {

        session.beginTransaction();

        Collection Usuario = session.createCriteria(Usuario.class).list();

        for (Iterator i = Usuario.iterator(); i.hasNext();) {
            session.beginTransaction();
            Usuario book = (Usuario) i.next();
            session.delete(book);
            session.getTransaction().commit();

        }

        return "exito";
    }

}
