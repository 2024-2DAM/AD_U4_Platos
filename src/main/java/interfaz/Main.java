package interfaz;

import clases.Ingrediente;
import clases.Plato;
import clases.Precio;
import clases.Proveedor;
import dao.*;
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


//        Precio p3 = new Precio("EUR", 125);
//        Plato plato1 = new Plato("ensaladilla rusa", "...", p3);
//        //PrecioDAO.crear(p3);
//        PlatoDAO.crear(plato1);

        Proveedor pr1 = new Proveedor("cif1", "nom1", "madrid");
        Ingrediente in1 = new Ingrediente("ingr1", pr1);
        Ingrediente in2 = new Ingrediente("ingr2", pr1);
        Plato plato = new Plato("nuevo", "...", new Precio("EUR", 1));
        plato.anadirIngrediente(in1);
        in1.anadirPlato(plato);

        ProveedorDAO.crear(pr1);
        IngredienteDAO.crear(in1);
        IngredienteDAO.crear(in2);
        PlatoDAO.crear(plato);

        Plato leido = PlatoDAO.leer(1);
        System.out.println(leido.getIngredientes());


    }
}
