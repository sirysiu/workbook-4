package com.pluralsight.car;

import java.util.Scanner;

public class UserInterface {

    public static void displayDealership() {
        Scanner scanner = new Scanner(System.in);
        boolean isrunning = true;
        System.out.print("""
                 Please choose an option:
                 1. Price
                 2. Make and Model
                 3. Year
                 4. Color
                 5. Mileage
                 6. Type
                 7. All Vehicles
                 8. Add Vehicles
                 9. Remove Vehicles
                 """);

        String choice = scanner.nextLine();
        while (isrunning) {
            switch (choice) {
                case "1":
                    Dealership.getVehiclesByPrice();
                    break;
                case "2":
                    Dealership.getVehiclesByMakeModel();
                    break;
                case "3":
                    Dealership.getVehiclesByYear();
                    break;
                case "4":
                    Dealership. getVehiclesByColor();
                    break;
                case "5":
                    Dealership. getVehicleByMileage();
                    break;
                case "6":
                    Dealership.getVehicleByType();
                    break;
                case "7":
                    Dealership.displayInventory();
                    break;

            } isrunning = false;
        }
    }

    public static void display() {

    }

    private void init() {

    }

    private void displayVehicles() {

    }

    public void processAllVehiclesRequest() {

    }

    }

