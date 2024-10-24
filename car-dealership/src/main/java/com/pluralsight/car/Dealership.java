package com.pluralsight.car;

import java.io.*;
import java.util.ArrayList;

public class Dealership {
    static ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership() {
        loadInventory();
    }

    private void loadInventory() {
        try {
            FileReader fileReader = new FileReader("src/main/resources/WorkshopFiles/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String header = bufferedReader.readLine();
            System.out.println("Dealership: " + header);
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                String[] inventoryParts = input.split("\\|");
                int vin = Integer.parseInt(inventoryParts[0]);
                int year = Integer.parseInt(inventoryParts[1]);
                String make = inventoryParts[2];
                String model = inventoryParts[3];
                String type = inventoryParts[4];
                String color = inventoryParts[5];
                int mileage = Integer.parseInt(inventoryParts[6]);
                double priceRange = Double.parseDouble(inventoryParts[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, mileage, priceRange);
                inventory.add(vehicle);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void printHeader(String header) {
        // Split the header and print each part
        String[] headerParts = header.split("\\|");
        System.out.printf("%-10s %-4s %-10s %-10s %-5s %-5s %-10s %-10s%n",
                headerParts[0], headerParts[1], headerParts[2], headerParts[3],
                headerParts[4], headerParts[5], headerParts[6], headerParts[7]);
    }


    public void displayInventory() {
        for (Vehicle vehicle : inventory) {
            System.out.printf("VIN: %s, Year: %d, Make: %s, Model: %s, Type: %s, Color: %s, Mileage: %d, Price: %.2f%n",
                    vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(), vehicle.getType(),
                    vehicle.getColor(), vehicle.getMileage(), vehicle.getPrice());
        }
    }
}

