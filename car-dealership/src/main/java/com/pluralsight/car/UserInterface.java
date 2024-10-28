package com.pluralsight.car;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

  private Dealership dealership;

  public UserInterface() {

  }
    private void init() {
      this.dealership = new DealershipFileManger().getDealership();
    }

    public void display() {
      init();
      boolean isRunning = true;
      while (isRunning) {
        menus();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        switch (input) {
          case "1":
            processGetByPriceRequest();
            break;
          case "x", "X":
            isRunning = false;
        }

      }
    }

    private static void menus() {
      System.out.println("""
              Menu
              Please Enter a Option:
              [1] Vehicle By Price
              [2] Vehicle By Make and Model
              [3] Vehicle By Year
              [4] Vehicle By Color
              [5] Vehicle By Mileage 
              [6] Vehicle By Type
              [7] Show All
              [8] Add Vehicle
              [9] Remove Vehicle 
              [x] Exit
            
              
              """);
    }





    private void displayVehicles(ArrayList<Vehicle> vehicles) {
      for (Vehicle vehicle: vehicles) {
        System.out.println(vehicle);
      }
    }

    private void processGetByPriceRequest() {
    //  ArrayList<Vehicle> vehiclesByPrice = dealership.getVehiclesByPrice(specificPrice);
    //  System.out.println(vehiclesByPrice);
    }

    public void processAllVehiclesRequest() {

    }

  }


