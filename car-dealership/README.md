# Car Dealership Inventory Management System

## Overview

This application is designed to manage a car dealership's inventory. It allows users to view, add, remove, and search for vehicles based on various criteria such as price, make, model, year, color, mileage, and type. The dealership's details and inventory are stored in a CSV file, which can be loaded and saved as needed.

## Features

- Load vehicle inventory from a CSV file.
- View vehicles by different criteria (price, make/model, year, color, mileage, type).
- Add new vehicles to the inventory.
- Remove vehicles from the inventory.
- Save dealership information and inventory back to the CSV file.

## Classes Overview

### 1. Dealership
This class represents the car dealership. It manages the inventory of vehicles and provides methods to load, add, remove, and retrieve vehicles based on various criteria. Key methods include:

- `loadInventory()`: Loads vehicle data from a CSV file.
- `addVehicle(Vehicle vehicle)`: Adds a new vehicle to the inventory.
- `removeVehicle(int vin)`: Removes a vehicle from the inventory by its VIN.
- `getVehiclesByPrice()`, `getVehiclesByMakeModel()`, `getVehiclesByYear()`, `getVehiclesByColor()`, `getVehiclesByMileage()`, `getVehiclesByType()`: Retrieves vehicles based on different criteria.
- `displayInventory()`: Displays all vehicles in the inventory.

### 2. Vehicle
This class represents an individual vehicle. It contains properties such as VIN, year, make, model, type, color, mileage, and price. It includes getter methods for each property and a constructor to initialize a vehicle object.

### 3. UserInterface
This class handles user interactions. It displays menus, prompts users for input, and processes requests such as viewing vehicles by various criteria, adding and removing vehicles, and saving dealership information. Key methods include:

- `display()`: Main loop for user interaction.
- `processGetByPriceRequest()`: Handles requests to view vehicles by price.
- `processAddVehicleRequest()`: Handles requests to add a new vehicle.
- `processRemoveVehicleRequest()`: Handles requests to remove a vehicle.
- Other methods for processing requests based on different criteria.

### 4. DealershipFileManager
This class is responsible for reading and writing the dealership's inventory data to and from a CSV file. It provides methods such as:

- `saveDealership(Dealership dealership)`: Saves dealership and inventory data to a CSV file.
- `loadDealership()`: Loads dealership information and inventory from a CSV file.

### 5. Main
This is the entry point of the application. It initializes the `UserInterface` and starts the application loop, allowing users to interact with the system.

## Usage

### Running the Application

1. Ensure you have Java installed.
2. Compile the Java files.
3. Run the `Main` class to start the application.

### Interacting with the System

- Follow the on-screen prompts to navigate the menu.
- Use the provided options to view, add, or remove vehicles.
- Input the necessary details when prompted.

### Data Storage

The vehicle inventory is stored in a CSV file located at `src/main/resources/WorkshopFiles/inventory.csv`. You can edit this file directly if needed, but it is recommended to use the application for adding/removing vehicles.

## Conclusion

This Car Dealership Inventory Management System provides a simple yet effective way to manage a dealership's vehicle inventory. It is designed to be user-friendly and extendable, allowing for future enhancements.
