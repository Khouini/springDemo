package esprit.tn.springdemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;

    @OneToOne(mappedBy = "universite", cascade = CascadeType.ALL)
    @JsonIgnore
    private Foyer foyer;

    public void setIdUniversite(Long idUniversite) {
        this.id = idUniversite;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", foyer=" + foyer +
                '}';
    }
}
