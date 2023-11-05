package chapter5;

import java.util.Scanner;

public class PhoneBill {
    static double tax = .15;
    static double multiply = .25;
   static Scanner scanner = new Scanner(System.in);
    public static void  main(String args[]){
        double base = baseCost();
        int overage = overageMinutes();
        scanner.close();
        phoneBillStatement(base,overage,tax,multiply);
    }

    public static double baseCost(){
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    public static int overageMinutes(){
        System.out.println("Enter the overage minutes:");
        return scanner.nextInt();
    }
    public static void phoneBillStatement(double base_cost, int overage, double tax, double multiply){
        System.out.println("Phone Bill Statement");
        System.out.printf("Plan: $%.2f", base_cost);
        System.out.printf("%nOverage: $%.2f", (overage * multiply));
        System.out.printf("%nTax: $%.2f", (base_cost + (overage * multiply)) * tax);
        System.out.printf("%nTotal: $%.2f", (base_cost) + ((base_cost + (overage * multiply)) * tax) + (overage * multiply));
    }
}
