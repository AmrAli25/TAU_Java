package chapter4;

import java.util.Scanner;

public class Casher {
    public static void main(String args[]){
        System.out.println("Enter the numbers of items you would like to scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;
        for (int i = 0; i<quantity; i++){
            System.out.println("Enter the cost of the item " + (i+1) );
            double price = scanner.nextDouble();
            total += price;
        }
        System.out.println("The total price is $" + total);
        scanner.close();
    }
}
