package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

   static int requiredSalary = 25000;
   static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]){

        double salary = getSalary();
        int creditScore = getCredit();
        scanner.close();
        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        return scanner.nextDouble();
    }
    public static int getCredit(){
        System.out.println("Enter your credit score:");
        return scanner.nextInt();
    }
    public static boolean isUserQualified(double salary, int creditScore){
        if (creditScore >= requiredCreditScore && salary >= requiredSalary)
            return true;
        else
            return false;
    }
    public static void notifyUser(boolean isQualified){
        if (isQualified)
            System.out.println("Congrats, You have been approved");
        else
            System.out.println("Sorry, You have been declined");
    }
}
