package com.pluralsight.hotel;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
       return isWeekend;

    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;

    }

    public double getReservationTotal() {
        double totalCost = price * numberOfNights;
        if (isWeekend){
            totalCost *= 1.1;
        } return totalCost;
    }


    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, int reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }
}
