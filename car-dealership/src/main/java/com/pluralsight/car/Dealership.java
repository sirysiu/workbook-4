package com.pluralsight.car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;


public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double specificPrice) {
        // Filter by specific price
        // Collect to ArrayList

        return inventory.stream()
                .filter(vehicle -> vehicle.getPrice() == specificPrice) // Filter by specific price
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel() {
        // Collect to an ArrayList

        return inventory.stream()
                .filter(vehicle -> vehicle.getMake() != null && !vehicle.getMake().isEmpty() &&
                        vehicle.getModel() != null && !vehicle.getModel().isEmpty())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByYear(int specificYear) {
        // Filter by specific year
        // Collect to ArrayList

        return inventory.stream()
                .filter(vehicle -> vehicle.getYear() == specificYear) // Filter by specific year
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByColor(String specificColor) {
        ArrayList<Vehicle> vehiclesByColor = inventory.stream()
                .filter(vehicle -> vehicle.getColor().equalsIgnoreCase(specificColor)) // Filter by specific color
                .collect(Collectors.toCollection(ArrayList::new)); // Collect to ArrayList

        return vehiclesByColor;
    }
    public ArrayList<Vehicle> getVehiclesByMileage(int specificMileage) {
        ArrayList<Vehicle> vehiclesByMileage = inventory.stream()
                .filter(vehicle -> vehicle.getMileage() == specificMileage) // Filter by specific mileage
                .collect(Collectors.toCollection(ArrayList::new)); // Collect to ArrayList

        return vehiclesByMileage;
    }

    public ArrayList<Vehicle> getVehiclesByType(String specificType) {
        ArrayList<Vehicle> vehiclesByType = inventory.stream()
                .filter(vehicle -> vehicle.getType().equalsIgnoreCase(specificType)) // Filter by specific type
                .collect(Collectors.toCollection(ArrayList::new)); // Collect to ArrayList

        return vehiclesByType;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }


}

