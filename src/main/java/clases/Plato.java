package clases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter  @NoArgsConstructor
public class Plato {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Precio precio;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Plato(String nombre, String descripcion, Precio precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void anadirIngrediente(Ingrediente i){
        ingredientes.add(i);
    }

    public void eliminarIngrediente(Ingrediente i){
        ingredientes.remove(i);
    }
}
