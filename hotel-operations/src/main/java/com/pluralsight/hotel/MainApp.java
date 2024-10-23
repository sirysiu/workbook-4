package com.pluralsight.hotel;

public class MainApp {
    public static void main(String[] args) {
        Room room = new Room(2, 1200.82, true, true);

        Employee employee = new Employee("A1", "Joe mama", "Front Desk", 15.35, 40);
        showRoom(room);
        showEmployee(employee);
    }

    private static void showRoom(Room r) {
        System.out.println("Numbers of Beds: " + r.getNumberOBeds() + " \nPrice: " + r.getPrice()
        + "\nAvailable: " + r.isAvailable());
    }
    private static void showEmployee(Employee e) {
        System.out.println(e.getName() + " made " + e.getTotalPay());
    }
}
