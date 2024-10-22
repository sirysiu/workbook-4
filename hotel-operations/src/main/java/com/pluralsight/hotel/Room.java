package com.pluralsight.hotel;

import java.util.Scanner;

public class Room {
    private int numberOBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOBeds = numberOBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOBeds() {
        return numberOBeds;
    }


}


