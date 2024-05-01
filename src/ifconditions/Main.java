package ifconditions;


import java.util.Scanner;

public class Main {

    static enum Gender { // Enumerated data type
        MALE, // Starts off with a value of 0
        FEMALE,    // Starts off with a value of 1
    }

    public static void main(String[] args) {
        String name, tempGender;
        int age;
        Gender gender;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        age = Integer.parseInt(scanner.nextLine());


        // If the user's age is above 20 and is male, Provide the user with a specific message
        // Otherwise render another message for the female

        System.out.print("Please enter your gender: ");
        tempGender = scanner.nextLine();

        // Update the variable called gender
        if (tempGender.equals("M"))
            gender = Gender.MALE;
        else
            gender = Gender.FEMALE;

        // Nested if statement
        if (age > 20) {
            // Check with the user is male or female to render the output
            if (gender == Gender.MALE)
                System.out.println("Welcome Mr. " + name);
            else
                System.out.println("Welcome Ms. " + name);
        } else {
            //user is not of age to attend the event - provide a message
            System.out.println("You are unable to attend this event.");


        }

    }

}
