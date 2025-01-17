package dao;

import clases.Proveedor;
import org.hibernate.Session;

public class ProveedorDAO {
    public static void crear(Proveedor p) {
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            session.getTransaction().begin();
            session.persist(p);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Proveedor leer(int id) {
        Proveedor p = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            p = session.find(Proveedor.class, id);
        }
        return p;
    }
}
