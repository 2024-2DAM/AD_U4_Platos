package clases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter @Setter @ToString @NoArgsConstructor
public class Plato {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Precio precio;
    @ManyToMany
    private List<Ingrediente> ingredientes;

    public Plato(String nombre, String descripcion, Precio precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void anadirIngrediente(Ingrediente i){

    }

    public void eliminarIngrediente(Ingrediente i){

    }
}
