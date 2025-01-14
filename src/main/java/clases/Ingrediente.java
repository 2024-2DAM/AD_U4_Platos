package clases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter @Setter @ToString @NoArgsConstructor
public class Ingrediente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @ManyToMany(mappedBy = "ingredientes")
    private List<Plato> platos;
    @ManyToOne
    private Proveedor proveedor;

    public void anadirPlato(Plato p){

    }
    public void eliminarPlato(Plato p){

    }
}
