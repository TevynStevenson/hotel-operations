package com.pluralsight;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {

        Employees employees = new Employees(100,"Tevyn","software", 40);

        System.out.println("Employee Id "  + employees.getEmployeeId());
        System.out.println("Name "  + employees.getName());
        System.out.println("Department "  + employees.getDepartment());
        System.out.println("Hours Worked "  + employees.getHoursWorked());


    }




}
