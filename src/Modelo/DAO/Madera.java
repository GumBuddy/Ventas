package Modelo.DAO;

import Modelo.DTO.Madera_Bean;
import Modelo.Hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Madera {

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

    public long save(Madera_Bean Madera_Bean) {
        long id = 0;
        try {
            StartOperation();
            id = (Long) session.save(Madera_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
        return id;
    }

    public void update(Madera_Bean Madera_Bean) throws HibernateException {
        try {
            StartOperation();
            session.update(Madera_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(Madera_Bean Madera_Bean) throws HibernateException {
        try {
            StartOperation();
            session.delete(Madera_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public Madera_Bean getMaderaDTO(long idAutorDTO) throws HibernateException {
        Madera_Bean Madera_Bean = null;
        try {
            StartOperation();
            Madera_Bean = session.get(Madera_Bean.class, idAutorDTO);
        } finally {
            session.close();
        }
        return Madera_Bean;
    }

    public List<Madera_Bean> getListMadera() throws HibernateException {
        List<Madera_Bean> listMadera = null;
        try {
            StartOperation();
            listMadera = session.createQuery("FROM Madera_Bean ").list();
        } finally {
            session.close();
        }
        return listMadera;
    }
}
