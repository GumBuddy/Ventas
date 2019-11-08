package Modelo.Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory SF;
    static {
        try {
            SF = new Configuration().configure("Modelo/Hibernate/hibernate.cfg.xml").buildSessionFactory();
        } catch (HibernateException HE) {
            System.err.println("Error de inicializacion de SF --> " + HE);
            throw new ExceptionInInitializerError(HE);
        }
    }

    public static SessionFactory getSf() {
        return SF;
    }
}

