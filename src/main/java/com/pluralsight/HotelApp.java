package com.pluralsight;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {

        //Make a new employee
        Employees employees = new Employees(100,"Tevyn", "Software");

        System.out.println("Employee Id "  + employees.getEmployeeId());
        System.out.println("Name "  + employees.getName());
        System.out.println("Department "  + employees.getDepartment());

        //employees.punchIn(10);
        //employees.punchOut(5);
        //employees.getHoursWorked();

        //Add punch time card
        employees.punchTimeCard(9,17);
        employees.punchIn();
        employees.punchOut();


        System.out.println("Total Hours Worked " + employees.getHoursWorked());
        System.out.println("\n");

        //Make a new room
        Room newRoom = new Room("King",2,1);

        System.out.println("Room type: " + newRoom.getRoomType());
        System.out.println("Number of Beds: " + newRoom.getNumberOfBeds());
        System.out.println("Number of Guests: " + newRoom.getNumberOfGuests());
        System.out.println("\n");

        //Make a new reservation
        Reservation reservation = new Reservation("double", 2,1);

        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Number of Guests: " + reservation.getNumberOfGuests());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Are you staying over the weekend? (Yes/No)");

        //Add scanner
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("true")){
            reservation.setWeekend(true);
        } else if(answer.equalsIgnoreCase("false")){
            reservation.setWeekend(false);
        }




        System.out.println("Price " + reservation.getReservationTotal());




    }




}
