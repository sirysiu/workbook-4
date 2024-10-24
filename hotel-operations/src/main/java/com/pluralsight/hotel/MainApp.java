package com.pluralsight.hotel;

import javax.print.DocFlavor;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Room room = new Room(2, 1200.82, true, true);
        Employee employee = new Employee("A1", "Joe mama", "Front Desk", 15.35, 40);
        Reservation reservation = new Reservation("double",0, 4,true, 0);
        showRoom(room);
        showEmployee(employee);
        showReservation(reservation);

    }


    private static void showRoom(Room r) {
        System.out.println("Room: ");
        System.out.println("Numbers of Beds: " + r.getNumberOBeds() +
         "\nAvailable: " + r.isAvailable() + "\nNeed to be Clean: " + r.cleanRoom());
    }
    private static void showEmployee(Employee e) {
        System.out.println("\nEmployee: ");
        System.out.println(e.getName() + " made " + e.getTotalPay() + "\nPunched in: " + e.getTime());
    }

    private static void showReservation( Reservation r) {
        System.out.println("\nReservation: ");
        System.out.println("Room type: " + r.getRoomType() + "\nPrice: " + r.getPrice() + "\nTotal: " + r.getReservationTotal());
    }
}
