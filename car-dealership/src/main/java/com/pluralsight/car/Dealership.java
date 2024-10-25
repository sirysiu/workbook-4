package com.pluralsight.car;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;


public class Dealership {
    static ArrayList<Vehicle> inventory = new ArrayList<>();

    public void Dealership() {
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

    public static void getVehiclesByPrice() {
        inventory.sort(Comparator.comparingDouble(Vehicle::getPrice)); // sort price from lowest to highest

        for (Vehicle vehicle : inventory) {
            System.out.println("Price: "+ vehicle.getPrice());
        }
    }

    public static void getVehiclesByMakeModel() {
        for (Vehicle vehicle : inventory) {
            System.out.println("Make and Model: " + vehicle.getMake() + " " + vehicle.getModel());
        }
    }

    public static void getVehiclesByYear(){
        for (Vehicle vehicle : inventory) {
            System.out.println(vehicle.getYear());
        }
    }

    public static void getVehiclesByColor() {
        for (Vehicle vehicle : inventory){
            System.out.println(vehicle.getColor());
    }
    }

    public static void getVehicleByMileage() {
        for (Vehicle vehicle : inventory) {
            System.out.println(vehicle.getMileage());
        }
    }

    public static void getVehicleByType() {
        for (Vehicle vehicle : inventory) {
            System.out.println(vehicle.getType());
        }
    }

    public static void addVehicle() {

    }

    public static void removeVehicle() {

    }



    public static void displayInventory() {
        for (Vehicle vehicle : inventory) {
            System.out.printf("VIN: %s, Year: %d, Make: %s, Model: %s, Type: %s, Color: %s, Mileage: %d, Price: %.2f%n",
                    vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(), vehicle.getType(),
                    vehicle.getColor(), vehicle.getMileage(), vehicle.getPrice());
        }
    }

}

