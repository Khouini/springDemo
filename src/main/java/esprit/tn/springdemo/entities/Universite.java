package esprit.tn.springdemo.entities;

import jakarta.persistence.*;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;

    @OneToOne(mappedBy = "universite")
    private Foyer foyer;
}
