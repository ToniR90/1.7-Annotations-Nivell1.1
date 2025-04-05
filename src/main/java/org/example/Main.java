package org.example;

public class Main {
    public static void main(String[] args) {

        RemoteWorker remoteWorker1 = new RemoteWorker("Toni" , "Romero" , 8);
        InOfficeWorker inOfficeWorker1 = new InOfficeWorker("Txell" , "Zolle" , 12);

        System.out.println ("Remote worker salary: " + remoteWorker1.calculateSalary(160) + " €");
        System.out.println("In office worker salary: " + inOfficeWorker1.calculateSalary(160) + " €");

    }
}