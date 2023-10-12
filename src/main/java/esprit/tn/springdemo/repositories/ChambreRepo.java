package esprit.tn.springdemo.repositories;

import esprit.tn.springdemo.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepo extends JpaRepository<Chambre, Long> {
    
}
