package com.pluralsight.hotel;

import java.util.Scanner;

public class Room {
    private final int numberOBeds;
    private final double price;
    private final boolean isOccupied;
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

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public boolean checkedIn() {
        return isOccupied && isDirty;
    }

    public boolean checkedOut() {
        return !isOccupied && isDirty;
    }

    public boolean cleanRoom() {
        return !checkedIn() && checkedOut();
    }

}


