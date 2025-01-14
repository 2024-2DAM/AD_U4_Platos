package clases;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Precio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double cantidad;
    private String divisa;
}
