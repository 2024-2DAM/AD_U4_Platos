package clases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter @Setter  @NoArgsConstructor
public class Ingrediente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @ManyToMany(mappedBy = "ingredientes", fetch = FetchType.EAGER)
    private List<Plato> platos;
    @ManyToOne
    private Proveedor proveedor;

    public Ingrediente(String nombre, Proveedor proveedor) {
        this.nombre = nombre;
        this.proveedor = proveedor;
    }

    public void anadirPlato(Plato p){

    }
    public void eliminarPlato(Plato p){

    }
}
