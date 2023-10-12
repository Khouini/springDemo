package esprit.tn.springdemo.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String capacite;

    @ManyToOne
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    // FetchType.Lazy : Load only Bloc data
    // FetchType.Eager : Load Bloc data and Chambre data
    // By default, the fetch type for @ManyToOne and @OneToOne relationships is EAGER
    // CascadeType.ALL : Apply all operations on Chambre to Bloc
    // CascadeType.PERSIST : Apply only persist operation on Chambre to Bloc
    // CascadeType.MERGE : Apply only merge operation on Chambre to Bloc
    // CascadeType.REMOVE : Apply only remove operation on Chambre to Bloc
    // CascadeType.REFRESH : Apply only refresh operation on Chambre to Bloc
    private List<Chambre> chambres;
}