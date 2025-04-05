package org.example;

abstract class Worker {

    private String name;
    private String surename;
    private double salaryPerHour;

    public Worker(String name, String surename , double salaryPerHour){
        this.name = name;
        this.surename = surename;
        this.salaryPerHour = salaryPerHour;
    }

    public double getSalaryPerHour() {
        return this.salaryPerHour;
    }

    public abstract double calculateSalary(double workedHoursPerMonth);
}
