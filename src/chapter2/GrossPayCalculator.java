package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
//        1. Get the number of hours worked
        System.out.println("enter the numbers of hours the employee worked ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

//        2. Get the hourly pay rate
        System.out.println("Enter the employee's hourly pay rate. ");
        double PayRate = scanner.nextDouble();
        scanner.close();

//        3. Multiply hours and pay rate
        double result = hours * PayRate;
//        4. Display results
        System.out.println("The result is " + result);
    }
}
