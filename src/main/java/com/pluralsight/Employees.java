package com.pluralsight;

//Import LocalDate

import java.time.LocalDateTime;

public class Employees {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Employees(int employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
    }

    private double hoursWorked;
    private int startTime;


    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOvertimeHour() * payRate * 1.5;

        return regularPay + overTimePay;
    }


    public double getRegularHours() {
        if (hoursWorked > 40) {
            hoursWorked = 40;
        }
        return this.hoursWorked;
    }

    public double getOvertimeHour() {
        if (hoursWorked > 40) {
            return this.hoursWorked - 40;
        }
        return 0;
    }

    //Add punchIn() method
    public void punchIn(int time) {
        this.startTime = time;

    }


    //Add punchOut() method
    public void punchOut(int time) {
        this.hoursWorked += this.startTime - time;

    }

    public void punchTimeCard(int startTime, int endTime) {
        this.punchIn(startTime);
        this.punchOut(endTime);
        this.hoursWorked += endTime - startTime;

    }

    //Add another punchIn method
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        this.startTime = now.getHour();
    }

    //Add another punchOut method
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        this.startTime = now.getHour();
    }


}

