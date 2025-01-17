package clases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Proveedor {
    @Id
    private String cif;
    private String nombre;
    private String ciudad;

    public Proveedor(String cif, String nombre, String ciudad) {
        this.cif = cif;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
}
