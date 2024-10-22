package com.pluralsight.hotel;

public class Reservation {
    private String roomType;
    private double price;

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

    public int getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(int reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    private int numberOfNights;
    private boolean isWeekend;
    private int reservationTotal;


    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, int reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }
}
