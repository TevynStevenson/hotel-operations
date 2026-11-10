package com.pluralsight;

import java.time.DayOfWeek;
import java.time.LocalDate;
/*
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


 */
//Practicing exercise
public class Reservation {
    private String roomType;
    private int numberOfGuests;
    private int numberOfNights;
    private double price;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfGuests, int numberOfNights) {
        this.roomType = roomType;
        this.numberOfGuests = numberOfGuests;
        this.numberOfNights = numberOfNights;
    }

    private double reservationTotal;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    //Number of  guests
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    //Get price
    public double getPrice() {
        // Add if statement for if the room type is King or Double

        if (getRoomType().equalsIgnoreCase("King")) {
            this.price = 139.00;
        } else if (getRoomType().equalsIgnoreCase("Double")) {
            this.price = 124.00;
        } else
            System.out.println("Invalid Room Type");
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Number of nights
    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    //IsWeekend
    public boolean isWeekend() {
        return isWeekend;
    }


    //Total
    public double getReservationTotal() {
        reservationTotal = getPrice() * numberOfNights;
        if (isWeekend) {
            reservationTotal = (getPrice() * 1.10) * numberOfNights;
        } else {
            reservationTotal = getPrice() * numberOfNights;
        }

        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }


}

