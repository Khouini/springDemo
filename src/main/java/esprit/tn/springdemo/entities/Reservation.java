package esprit.tn.springdemo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private Date anneeUniversitaire;
    private Boolean estValide;

    @ManyToOne
    private Chambre chambre;

    @ManyToMany
    @JoinTable(name = "etudiants_reservations",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id"))
    private List<Etudiant> etudiants;
}
