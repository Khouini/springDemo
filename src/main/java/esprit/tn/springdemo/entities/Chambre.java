package esprit.tn.springdemo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private Bloc bloc;

    //@OneToMany(mappedBy = "chambre")
    @OneToMany
    private Set<Reservation> reservations;

    @Override
    public String toString() {
        return "Chambre{" +
                "id=" + id +
                ", numero=" + numero +
                ", type=" + type +
                ", bloc=" + bloc +
                ", reservations=" + reservations +
                '}';
    }
}
