package com.pluralsight.hotel;

import static org.junit.jupiter.api.Assertions.*;
class ReservationTest {

    @org.junit.jupiter.api.Test
    void isWeekend() {

        Reservation reservation = new Reservation("King", 0,3,true,0);

        assertFalse(reservation.isWeekend());
    }
}