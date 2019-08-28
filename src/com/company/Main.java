package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Кожомкул";
        int age = 69;
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

