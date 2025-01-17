package interfaz;

import clases.Ingrediente;
import clases.Plato;
import clases.Precio;
import dao.HibernateUtil;
import dao.PlatoDAO;
import dao.PrecioDAO;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory();

//        Precio p1 = new Precio("EUR", 125);
//        Precio p2 = new Precio("DIR", 463);
//
//        PrecioDAO.crear(p1);
//        PrecioDAO.crear(p2);
//
//        p1.setCantidad(126);
//        PrecioDAO.actualizar(p1);
//
//        PrecioDAO.eliminar(p1);


        Precio p3 = new Precio("EUR", 125);
        Plato plato1 = new Plato("ensaladilla rusa", "...", p3);
        //PrecioDAO.crear(p3);
        PlatoDAO.crear(plato1);



        //Varios platos mismo precio (luego)

    }
}
