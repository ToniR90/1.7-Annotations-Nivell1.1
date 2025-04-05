# 1.7.1.1: Java Worker Hierarchy Exercise

## Description

This project implements a hierarchy of worker objects in Java, consisting of three classes: `Worker`, `RemoteWorker`, and `InOfficeWorker`. The `Worker` class has basic attributes and a method to calculate salary, while the derived classes override this method to include additional compensation based on their work type.

## Classes

### Worker

The `Worker` class represents a generic worker with the following attributes:
- `name` (first name)
- `surename` (last name)
- `SalaryPerHour` (price per hour)

#### Methods
- `double calculateSalary(int workedHours)`: Calculates the salary based on hours worked and price per hour.

### InOfficeWorker

The `InOfficeWorker` class extends `Worker` and adds:
- A static attribute `gas`, which represents additional compensation for transportation.

#### Methods
- `@Override double calculateSalary(int workedHours)`: Overrides the method to include the `gas` value in the salary calculation.

### RemoteWorker

The `RemoteWorker` class extends `Worker` and adds:
- A constant `INTERNET`, which represents a fixed cost for internet access.

#### Methods
- `@Override double calculateSalary(int workedHours)`: Overrides the method to include the internet tariff in the salary calculation.

## Main Class

The `Main` class contains the `main` method, which:
1. Creates instances of `InOfficeWorker` and `RemoteWorker`.
2. Calls the `calulateSalary` method to demonstrate the use of the `@Override` annotation.

## How to Run

Copy this repository: https://github.com/ToniR90/1.7-Annotations-Nivell1.1.git

## Output

The program prints the calculated salaries for both the presencial and online workers, demonstrating the functionality of the overridden methods.
 
