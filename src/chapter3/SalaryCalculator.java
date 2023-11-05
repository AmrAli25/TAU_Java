package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void  main(String args[]){
        int salary = 1000, bonus = 250;
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales > 10){
            salary += bonus;
        }
        System.out.println("The salary is " + salary);
    }
}
