package Modelo.DAO;

import Modelo.DTO.Permissions_Bean;
import Modelo.Hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Permissions {

    private static Session session;
    private static Transaction transaction;

    private void StartOperation() throws HibernateException {
        session = HibernateUtil.getSf().openSession();
        transaction = session.beginTransaction();
    }

    /*MasterOfEX= manejador de excepsiones */
    private void MasterOfEX(HibernateException HE) throws HibernateException {
        transaction.rollback();
        throw new HibernateException("Error en al acceder a datos en " + HE);
    }

    public void save(Permissions_Bean Permissions_Bean) {

        try {
            StartOperation();
            session.save(Permissions_Bean);
            transaction.commit();

        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }


    public void update(Permissions_Bean Permissions_Bean) throws HibernateException {
        try {
            StartOperation();
            session.update(Permissions_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public void delete(Permissions_Bean Permissions_Bean) throws HibernateException {
        try {
            StartOperation();
            session.delete(Permissions_Bean);
            transaction.commit();
        } catch (HibernateException HE) {
            MasterOfEX(HE);
            throw HE;
        } finally {
            session.close();
        }
    }

    public Permissions_Bean getPermissionsDTO(long idAutorDTO) throws HibernateException {
        Permissions_Bean Permissions_Bean = null;
        try {
            StartOperation();
            Permissions_Bean = session.get(Permissions_Bean.class, idAutorDTO);
        } finally {
            session.close();
        }
        return Permissions_Bean;
    }

    public List<Permissions_Bean> getListPermissions() throws HibernateException {
        List<Permissions_Bean> listPermissions = null;
        try {
            StartOperation();
            listPermissions = session.createQuery("FROM Permissions_Bean ").list();
        } finally {
            session.close();
        }
        return listPermissions;
    }
    static  String convertirSHA256(String password) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

        byte[] hash = md.digest(password.getBytes());
        StringBuffer sb = new StringBuffer();

        for(byte b : hash) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }

    static public int  getAuthUserDTO(String Usuario,String Pass) throws HibernateException {
        int flag=0;
        try {
            session = HibernateUtil.getSf().openSession();
            transaction = session.beginTransaction();
            /*encriptamos la contraseña ingresada por el usuario*/
            String Pass2= convertirSHA256(Pass);
            /*Consultamos al usuario */
            //Permissions_Bean Bean = session.get(Permissions_Bean.class,Usuario);
            Permissions_Bean Bean = (Permissions_Bean) session.createQuery("FROM Permissions_Bean u where u.user= '"+Usuario+"' AND u.password= '"+Pass2+"'").uniqueResult();

            /*Verificamos si las contraseñas encryptadas coinciden*/
            if(Bean!=null)
            {
                /*Si todo sale bien regresamos 1*/
                flag=1;
                return flag;
            }
            else
            {
                /*Si la autentificacion falla regresamos 0 */
                return flag;
            }

        } finally {
            session.close();
        }
    }

    public Permissions_Bean getUser(String Usuario,String Pass) throws HibernateException {
        Permissions_Bean Permissions_Bean = null;
        try {
            StartOperation();
            Permissions_Bean = session.get(Permissions_Bean.class, Usuario);
        } finally {
            session.close();
        }
        return Permissions_Bean;
    }

}
