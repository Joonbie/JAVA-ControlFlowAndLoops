package switchstatements;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        String day;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favourite day of the week");
        day = scanner.next();

        switch (day.toLowerCase()){
            case "monday":
                System.out.println("Monday Blues");
                break;
            case "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday":
                System.out.println("Hurrah!");
                break;
            default:
                System.out.println("Everday is a sunday!");
                break;
        }



    }

}
