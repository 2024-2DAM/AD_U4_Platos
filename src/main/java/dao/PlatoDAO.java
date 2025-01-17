package dao;

import clases.Plato;
import org.hibernate.Session;

public class PlatoDAO {
    public static void crear(Plato plato) {
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            session.getTransaction().begin();
            session.persist(plato);
            session.getTransaction().commit();
        }
    }
}
