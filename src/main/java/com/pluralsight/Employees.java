package com.pluralsight;

public class Employees {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public double getTotalPay(){
        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOvertimeHour() * payRate * 1.5;

        return regularPay + overTimePay;
    }



    public double getRegularHours(){
        if(hoursWorked > 40){
            hoursWorked = 40;
        }
        return hoursWorked;
    }

    public double getOvertimeHour(){
        if(hoursWorked > 40){
            hoursWorked = hoursWorked - 40;
        }
        return 0;
    }



}
