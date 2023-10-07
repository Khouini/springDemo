package esprit.tn.springdemo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long numero;
    @Enumerated(EnumType.STRING)
    private TypeChambre type;

    @ManyToOne
    private Bloc bloc;

    //@OneToMany(mappedBy = "chambre")
    @OneToMany
    private Set<Reservation> reservations;
}
