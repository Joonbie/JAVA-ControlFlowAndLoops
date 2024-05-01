package javaloopchallenge;

import java.util.Scanner;

public class MovieDiscounts {

    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the cinema!");
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        if (age >= 6 && age <= 60) {
            System.out.println("Please pay 7 Euros");
        } else if (age >= 1 && age <= 5) {
            System.out.println("Please pay 2.80 Euros");
        } else if (age >= 60) {
            System.out.println("Please pay 3.50 Euros");
        } else {
            System.out.println("Invalid age input.");
        }
    }
}
