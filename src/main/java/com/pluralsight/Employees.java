package com.pluralsight;

public class Employees {

    private int employeeId;
    private String name;
    private String department;
    private double hoursWorked;

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

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Employees(int employeeId, String name, String department, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
    }

    private double payRate;
    private int startTime;


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
            return this.hoursWorked - 40;
        }
        return 0;
    }

    //Add punchIn() method
    public void punchIn(int time){
      this.startTime = time;

    }


    //Add punchOut() method
    public void punchOut(int time){
       this.hoursWorked += time - this.startTime;

    }
}
