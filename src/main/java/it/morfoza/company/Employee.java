package it.morfoza.company;

public class Employee {
    private double salary;


    public Employee(double salary){
        this.salary = salary;
    }


    public void giveRise (int percent) {
        double rise = salary*percent/100;
        double newSalary = salary+rise;
        salary=newSalary;

    };

    public double getSalary() {
       return salary;
    }

}





