package dao;

import clases.Ingrediente;
import org.hibernate.Session;

public class IngredienteDAO {
    public static void crear (Ingrediente ingrediente) {
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.getTransaction().begin();
            session.persist(ingrediente);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Ingrediente leer(int id){
        Ingrediente i = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            i = session.find(Ingrediente.class, id);
        }
        return i;
    }
}
