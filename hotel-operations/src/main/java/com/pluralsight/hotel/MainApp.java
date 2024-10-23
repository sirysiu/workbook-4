package com.pluralsight.hotel;

import javax.print.DocFlavor;

public class MainApp {
    public static void main(String[] args) {
        Room room = new Room(2, 1200.82, true, true);

        Employee employee = new Employee("A1", "Joe mama", "Front Desk", 15.35, 40);


        Reservation reservation = new Reservation("King", 1000.00, 4,true, 0);
        showRoom(room);
        showEmployee(employee);
        showReservation(reservation);
    }

    private static void showRoom(Room r) {
        System.out.println("Numbers of Beds: " + r.getNumberOBeds() + " \nPrice: " + r.getPrice()
        + "\nAvailable: " + r.isAvailable());
    }
    private static void showEmployee(Employee e) {
        System.out.println(e.getName() + " made " + e.getTotalPay());
    }

    private static void showReservation( Reservation r) {
        System.out.println("Room type: " + r.getRoomType() + "\nPrice: " + r.getPrice() + "\nTotal: " + r.getReservationTotal());
    }
}
