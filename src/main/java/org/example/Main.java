package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("What is the parcel weight in kilograms?");
        var weight = scanner.nextDouble();

        while (true) {
            System.out.println("Delivery cost per kilogram in UAH");
            var delivery = scanner.nextDouble();

            if (delivery == 0)
                break;

            var result = delivery * weight;
            System.out.println("Result = " + result);
        }
    }
}