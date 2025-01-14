package dao;

import clases.Precio;
import org.hibernate.HibernateError;
import org.hibernate.Session;

public class PrecioDAO {
    //Create
    public static void crear(Precio p){
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.getTransaction().begin();
            session.persist(p);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Read
    public static Precio leer(int id){
        Precio p = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
             p = session.find(Precio.class, id);
        }
        return p;
    }

    //Update
    public static void actualizar(Precio p){
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.getTransaction().begin();
            session.merge(p);
            session.getTransaction().commit();
        }
    }

    //Delete
    public static void eliminar(Precio p){
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.getTransaction().begin();
            session.remove(p);
            session.getTransaction().commit();
        }
    }

}
