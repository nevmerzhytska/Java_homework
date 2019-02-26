package com.qa1.lesson2;

public class Task2 {

    public static void main(String[] args) {

        int number = 438, tmp = number;

        System.out.println("Исходное число: " + number);

        int n1 = 0;

        while (tmp != 0){
            n1 = n1*10 + tmp%10;
            tmp /= 10;
        }
        System.out.println("Обратный порядок: " + n1);

        int result = number + n1;

        System.out.println(result);

    }
}
