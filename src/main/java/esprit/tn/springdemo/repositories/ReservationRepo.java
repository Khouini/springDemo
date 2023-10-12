package esprit.tn.springdemo.repositories;

import esprit.tn.springdemo.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReservationRepo extends JpaRepository<Reservation, Long> {
}
