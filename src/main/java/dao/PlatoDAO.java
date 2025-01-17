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

    public static Plato leer(int id) {
        Plato p = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            p = session.find(Plato.class, id);
        }
        return p;
    }
}
