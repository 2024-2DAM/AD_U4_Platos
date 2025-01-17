package dao;

import clases.Precio;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

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

    //Leer todos los precios
    private static List<Precio> leerTodos(){
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            String hql = "from Precio"; //select p from Precio p
            Query q = session.createQuery(hql, Precio.class);
            return q.getResultList();
        }
    }

    //Leer todos los precios entre dos valores
    private static List<Precio> leerTodos(int min, int max){
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            String hql = "select p from Precio p where p.cantidad > :min and p.cantidad < :max";
            Query q = session.createQuery(hql, Precio.class);
            q.setParameter("min", min);
            q.setParameter("max", max);
            return q.getResultList();
        }
    }
}
