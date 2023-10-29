package esprit.tn.springdemo.services;

import esprit.tn.springdemo.entities.Reservation;
import esprit.tn.springdemo.repositories.ReservationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    private final ReservationRepo reservationRepo;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return reservationRepo.findById(idReservation).orElse(null);
    }
}
