package esprit.tn.springdemo.services;

import esprit.tn.springdemo.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation(Reservation res);

    Reservation updateReservation(Reservation res);

    Reservation retrieveReservation(long idReservation);
}
