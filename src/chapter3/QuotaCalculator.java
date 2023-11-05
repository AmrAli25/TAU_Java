package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void  main(String args[]){
        int quota = 10;
        System.out.println("How many sales the employee made?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales >= quota)
            System.out.println("Congrats ^^");
        else
            System.out.println("Good luck next time");
    }
}
