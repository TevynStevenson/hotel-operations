package com.pluralsight;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {

        Employees employees = new Employees(100,"Tevyn", "Software", 0,8);

        System.out.println("Employee Id "  + employees.getEmployeeId());
        System.out.println("Name "  + employees.getName());
        System.out.println("Department "  + employees.getDepartment());
        System.out.println("Start Time " + employees.getStartTime());

        employees.punchIn(10);
        employees.punchOut(5);
        employees.getHoursWorked();

        System.out.println("Total Hours Worked " + employees.getHoursWorked());
        System.out.println("\n");

        Room newRoom = new Room("King",2,1);

        System.out.println("Room type: " + newRoom.getRoomType());
        System.out.println("Number of Beds: " + newRoom.getNumberOfBeds());
        System.out.println("Number of Guests: " + newRoom.getNumberOfGuests());
        System.out.println("\n");

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
