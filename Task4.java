package com.qa1.lesson2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Enter the initial deposit amount: ");
        Scanner scanner1 = new Scanner(System.in);
        double amount = scanner1.nextDouble();

        System.out.println("Enter the deposit term in months: ");
        Scanner scanner2 = new Scanner(System.in);
        int term = scanner2.nextInt();

        System.out.println("Enter the annual interest rate: ");
        Scanner scanner3 = new Scanner(System.in);
        double rate = scanner3.nextDouble();

        double income = amount + (amount * rate / 12 * term);
        System.out.println("Amount of income: " + income);


    }
}
