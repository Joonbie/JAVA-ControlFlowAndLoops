package javaloopchallenge;

import java.util.Scanner;

public class CommissionCalculator {

    public static void main(String[] args) {
        int purchases = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your purchase amount");
        purchases = scanner.nextInt();


        if (purchases >= 1000 && purchases <= 4999){
            System.out.println("Your Comission is 10%");
        }else if (purchases >= 5001 && purchases <= 9999){
            System.out.println("Your Comission is 20%");
        }else if (purchases >= 10000){
            System.out.println("Your Comission is 30%");
        }else {
            System.out.println("You have no Comission");
        }


    }
}
