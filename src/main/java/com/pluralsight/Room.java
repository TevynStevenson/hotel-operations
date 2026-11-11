package com.pluralsight;

public class Room {

    private String roomType;
    private int numberOfBeds;
    private int numberOfGuests;
    private boolean isOccupied;
    private boolean isClean;


    public Room(String roomType, int numberOfBeds, int numberOfGuests, boolean isOccupied, boolean isClean) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.numberOfGuests = numberOfGuests;
        this.isOccupied = isOccupied;
        this.isClean = isClean;

    }


    //Room type
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    //Number of beds
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    //Number of guests
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    //Is occupied
    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    //Is clean
    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }


    //Make a checkIn class
    public void cleanRoom() {
        if (!isOccupied()) {
            isClean = true;
        } else
            System.out.println("Room is occupied");
    }

    public void checkIn() {
        if (!isOccupied() && isClean()) {
            isOccupied = true;
            isClean = false;
        }

    }

    public void checkOut() {
        if (isOccupied()) {
            isOccupied = false;
            isClean = false;
        }
    }

}
