package Modelo.DAO;

import Modelo.DTO.Cliente_Bean;
import Modelo.Hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Cliente {

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
/*
    public void save(Cliente_Bean Cliente_Bean) {

        try {
            StartOperation();
            session.save(Cliente_Bean);
            transaction.commit();
        
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }*/

    public void save(Cliente_Bean Cliente_Bean) {
            StartOperation();
            session.save(Cliente_Bean);
            transaction.commit();
            session.close();
        }


    public void update(Cliente_Bean Cliente_Bean) throws HibernateException {
        try {
            StartOperation();
            session.update(Cliente_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(Cliente_Bean Cliente_Bean) throws HibernateException {
        try {
            StartOperation();
            session.delete(Cliente_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public Cliente_Bean getClienteDTO(long idAutorDTO) throws HibernateException {
        Cliente_Bean Cliente_Bean = null;
        try {
            StartOperation();
            Cliente_Bean = session.get(Cliente_Bean.class, idAutorDTO);
        } finally {
            session.close();
        }
        return Cliente_Bean;
    }

    public List<Cliente_Bean> getListCliente() throws HibernateException {
        List<Cliente_Bean> listCliente = null;
        try {
            StartOperation();
            listCliente = session.createQuery("FROM Cliente_Bean ").list();
        } finally {
            session.close();
        }
        return listCliente;
    }
}
