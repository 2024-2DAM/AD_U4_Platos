package clases;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor
public class Precio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double cantidad;
    @Column(name = "moneda", nullable = false)
    private String divisa;

    public Precio(String divisa, double cantidad) {
        this.divisa = divisa;
        this.cantidad = cantidad;
    }

}
