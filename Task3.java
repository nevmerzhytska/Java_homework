package com.qa1.lesson2;

import java.util.Scanner;

        public class Task3 {

            public static void main(String[] args) {
                System.out.println("Enter weight in pounds: ");
                Scanner scanner = new Scanner(System.in);
                int pounds = scanner.nextInt();

                double grams = pounds * 453.6;
                int kilograms = (int)grams / 1000;

                System.out.println("Weight in kilograms: " + kilograms);
                System.out.println("Weight in grams: " + grams);

                grams = grams - kilograms * 1000;

                System.out.println(pounds + " pounds is " + kilograms + " kilograms and " + grams + " grams");
            }
        }

