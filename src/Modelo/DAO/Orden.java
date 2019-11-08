package Modelo.DAO;

import Modelo.DTO.Orden_Bean;
import Modelo.Hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Orden {

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

    public long save(Orden_Bean Orden_Bean) {
        long id = 51;
        try {
            StartOperation();
            id = (Long) session.save(Orden_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
        return id;
    }

    public void update(Orden_Bean Orden_Bean) throws HibernateException {
        try {
            StartOperation();
            session.update(Orden_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(Orden_Bean Orden_Bean) throws HibernateException {
        try {
            StartOperation();
            session.delete(Orden_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public Orden_Bean getOrdenDTO(long idAutorDTO) throws HibernateException {
        Orden_Bean Orden_Bean = null;
        try {
            StartOperation();
            Orden_Bean = session.get(Orden_Bean.class, idAutorDTO);
        } finally {
            session.close();
        }
        return Orden_Bean;
    }

    public List<Orden_Bean> getListOrden() throws HibernateException {
        List<Orden_Bean> listOrden = null;
        try {
            StartOperation();
            listOrden = session.createQuery("FROM Orden_Bean ").list();
        } finally {
            session.close();
        }
        return listOrden;
    }
}
