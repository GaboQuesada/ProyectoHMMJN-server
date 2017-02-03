package ac.cr.una.backend.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Gabo Quesada
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() throws HibernateException {

        return new AnnotationConfiguration().configure().buildSessionFactory();

    }

    /**
     *
     * @return
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     *
     */
    public static void shutdown() {

        getSessionFactory().close();
    }
}
