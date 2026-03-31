package edu.pe.cibertec.advance;

import java.util.List;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Reservation getReservation();
    Reservation registerReservation(Reservation reservation);
    void deleteReservation(Long id);
}
