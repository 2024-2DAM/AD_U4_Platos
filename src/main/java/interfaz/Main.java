package interfaz;

import clases.Precio;
import dao.HibernateUtil;
import dao.PrecioDAO;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory();

        Precio p1 = new Precio("EUR", 125);
        Precio p2 = new Precio("DIR", 463);

        PrecioDAO.crear(p1);
        PrecioDAO.crear(p2);

        p1.setCantidad(126);
        PrecioDAO.actualizar(p1);

        PrecioDAO.eliminar(p1);
    }
}
