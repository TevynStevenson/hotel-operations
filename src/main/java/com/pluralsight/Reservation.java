package com.pluralsight;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
       double king = 139.99;
       if(getRoomType().equalsIgnoreCase("King")) {
           return king;
       }
        return 124;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfDays(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        LocalDate date = LocalDate.now();

        if (date.getDayOfWeek() == DayOfWeek.SATURDAY
                || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return true;
        }
        return false;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        if (isWeekend) {
            return (price + (price * .10)) * getNumberOfNights();

        }
        return price * getNumberOfNights();
    }
}
