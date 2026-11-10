package com.pluralsight;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {

        //Make a new employee
        Employees employees = new Employees(100, "Tevyn", "Software");

        System.out.println("Employee Id " + employees.getEmployeeId());
        System.out.println("Name " + employees.getName());
        System.out.println("Department " + employees.getDepartment());

        //employees.punchIn(10);
        //employees.punchOut(5);
        //employees.getHoursWorked();

        //Add punch time card
        employees.punchTimeCard(9, 17);
        employees.punchIn();
        employees.punchOut();


        System.out.println("Total Hours Worked " + employees.getHoursWorked());
        System.out.println("\n");

        //Make a new room
        Room newRoom = new Room("King", 2, 1);

        System.out.println("Room type: " + newRoom.getRoomType());
        System.out.println("Number of Beds: " + newRoom.getNumberOfBeds());
        System.out.println("Number of Guests: " + newRoom.getNumberOfGuests());
        System.out.println("\n");

        //Make a new reservation
        Reservation reservation = new Reservation("double", 2, 1);

        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Number of Guests: " + reservation.getNumberOfGuests());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Are you staying over the weekend? (Yes/No)");

        //Add scanner
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("Yes")) {
            reservation.setWeekend(true);
        } else if (answer.equalsIgnoreCase("No")) {
            reservation.setWeekend(false);
        }

        System.out.println("Price " + reservation.getReservationTotal());
        System.out.println("\n");

        //Add new hotel
        Hotel nikeOpeningHotel = new Hotel("Nike Opening Hotel", 100, 200);


        //Add scanner to prompt the user
        Scanner scanner = new Scanner(System.in);

        //Welcome message
        System.out.println("Welcome to " + nikeOpeningHotel.getName());

        //Prompt user to input number of rooms
        System.out.println("How many rooms would you like to book?");
        int roomCount = scanner.nextInt();

        //Ask if user wants a suite
        System.out.println("Would you like a suite? (yes/no)");
        String answer1 = scanner.next();

        boolean suite = answer.equalsIgnoreCase("yes");

        boolean booked = nikeOpeningHotel.bookRoom(roomCount, suite);

        if (booked) {
            System.out.println("Your rooms have been successfully booked!");
        } else {
            System.out.println("Sorry, not enough rooms are available.");
        }

        System.out.println("Available suites: " + nikeOpeningHotel.getAvailableSuites());
        System.out.println("Available basic rooms: " + nikeOpeningHotel.getAvailableBasicRooms());

        scanner.close();
    }
}










