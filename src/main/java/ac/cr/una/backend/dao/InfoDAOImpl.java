package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Info;
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
public class InfoDAOImpl implements InfoDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public Info infocreate(Info info) {
        session.beginTransaction();
        session.save(info);
        session.getTransaction().commit();

        return info;
    }

    @Override
    public List<Info> infoGetAll() {
        List<Info> infoList = new ArrayList<>();

        infoList = session.createCriteria(Info.class).list();

        return infoList;
    }

    @Override
    public List<Info> infoGetAllByUsuario(int idUsuario) {
        
        List<Info> infoList = new ArrayList<>();
        infoList = session.createCriteria(Info.class).list();

        List<Info> lista = new ArrayList<>();
        int tam = infoList.size();
        
        for(int i=0 ; i< tam;i++)
        {
        
            if(infoList.get(i).getIdUsuario().getIdUsuario()== idUsuario)
            {
                lista.add(infoList.get(i));
            }
        
        }
       
        return lista;
    }

    @Override
    public boolean infoDeleteByUsuario(int idUsuario) {

        session.beginTransaction();

        List<Info> infoList = new ArrayList<>();
        infoList = session.createCriteria(Info.class).list();

        List<Info> lista = new ArrayList<>();
        int tam = infoList.size();
        
        for(int i=0 ; i< tam;i++)
        {
        
            if(infoList.get(i).getIdUsuario().getIdUsuario()== idUsuario)
            {
                lista.add(infoList.get(i));
            }
        
        }

        Collection Info = lista;

        for (Iterator i = Info.iterator(); i.hasNext();) {
            session.beginTransaction();
            Info book = (Info) i.next();
            session.delete(book);
            session.getTransaction().commit();

        }
        return true;
    }

}
