package Modelo.DAO;

import Modelo.DTO.Detalles_Bean;
import Modelo.Hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Detalles {

    private Session session;
    private Transaction transaction;

    private void StartOperation() throws HibernateException {
        session = HibernateUtil.getSf().openSession();
        transaction = session.beginTransaction();
    }

    /*MasterOfEX= manejador de excepsiones */
    private void MasterOfEX(HibernateException HE) throws HibernateException {
        transaction.rollback();
        throw new HibernateException("Error en al acceder a datos en " + HE);
    }

    public long save(Detalles_Bean Detalles_Bean) {
        long id = 0;
        try {
            StartOperation();
            id = (Long) session.save(Detalles_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
        return id;
    }

    public void update(Detalles_Bean Detalles_Bean) throws HibernateException {
        try {
            StartOperation();
            session.update(Detalles_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(Detalles_Bean Detalles_Bean) throws HibernateException {
        try {
            StartOperation();
            session.delete(Detalles_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public Detalles_Bean getDetallesDTO(long idAutorDTO) throws HibernateException {
        Detalles_Bean Detalles_Bean = null;
        try {
            StartOperation();
            Detalles_Bean = session.get(Detalles_Bean.class, idAutorDTO);
        } finally {
            session.close();
        }
        return Detalles_Bean;
    }

    public List<Detalles_Bean> getListDetalles() throws HibernateException {
        List<Detalles_Bean> listDetalles = null;
        try {
            StartOperation();
            listDetalles = session.createQuery("FROM Detalles_Bean ").list();
        } finally {
            session.close();
        }
        return listDetalles;
    }
}
