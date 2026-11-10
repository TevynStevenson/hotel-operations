package com.pluralsight;

import java.util.Scanner;

public class Hotel {

    //Initialize variables
    private final String name;
    private final int numberOfSuites;
    private final int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }


    public int getNumberOfRooms() {
        return numberOfRooms;
    }


    public int getBookedSuites() {
        return 0;
    }


    public int getBookedBasicRooms() {
        return 0;
    }


    //Make constructor 1 for name, suites, rooms, booked suites, and basic rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms =  bookedBasicRooms;
    }


    //Make constructor 2 for name number of suites and number of rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    //Make Available suites method
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    //Make available rooms method
    public int getAvailableBasicRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    //Make book room method
    public boolean bookRoom(int roomCount, boolean suite) {
        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                bookedSuites += roomCount;
                return true;
            }

        } else {

            if (roomCount <= getAvailableBasicRooms()) {
                bookedBasicRooms += roomCount;
                return true;
            }
        }
        return false;
    }
}
