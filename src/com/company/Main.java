package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String name = "Кожомкул";
        int a = 0;
        int b = 107;
        int generateRandomAge = a + (int) (Math.random() * b);
        System.out.println(generateRandomAge);
        int age = generateRandomAge;
        int temp = 20;

        if (age > 20 && age < 45) {
            if (temp > 30 || temp < -20) {
                System.out.println("Не выходим");
            } else {
                System.out.println("К другу");
            }
        } else if (age < 20) {
            if (temp > 28 || temp < 0) {
                System.out.println("Не выходим");
            } else {
                System.out.println("К другу");
            }
        } else if (age > 45) {
            if (temp < -10 || temp > 25) {
                System.out.println("Не выходим");
            } else {
                System.out.println("К другу");
            }
        }

    }
}