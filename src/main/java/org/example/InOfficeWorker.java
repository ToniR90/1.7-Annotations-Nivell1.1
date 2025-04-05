package org.example;

public class InOfficeWorker extends Worker{
    private static double gas = 100;


    public InOfficeWorker(String name, String surename , double salaryPerHour){
        super(name, surename , salaryPerHour);
    }

    @Override
    public double calculateSalary(double workedHoursPerMonth) {
        return (super.getSalaryPerHour() * workedHoursPerMonth) + gas;
    }
}
