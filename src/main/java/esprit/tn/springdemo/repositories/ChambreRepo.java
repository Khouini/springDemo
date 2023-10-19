package esprit.tn.springdemo.repositories;

import esprit.tn.springdemo.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepo extends JpaRepository<Chambre, Long> {
    List<Chambre> findChambresByBloc_Nom(String nom);

}
