package esprit.tn.springdemo.entities;

import jakarta.persistence.*;

@Entity
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String capacite;

    @ManyToOne
    private Foyer foyer;
}
