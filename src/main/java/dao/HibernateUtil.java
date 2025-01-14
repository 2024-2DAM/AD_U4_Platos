package dao;
import clases.Ingrediente;
import clases.Plato;
import clases.Precio;
import clases.Proveedor;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try (StandardServiceRegistry registry = new
                    StandardServiceRegistryBuilder().build();) {
                sessionFactory = new MetadataSources(registry)
                        .addAnnotatedClass(Precio.class)
                        .addAnnotatedClass(Plato.class)
                        .addAnnotatedClass(Proveedor.class)
                        .addAnnotatedClass(Ingrediente.class)
                        //.addAnnotatedClass(...) Otras clases
                        .buildMetadata().buildSessionFactory();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
