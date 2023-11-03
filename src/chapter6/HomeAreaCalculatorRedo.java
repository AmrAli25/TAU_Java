package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main (String args[]){
        HomeAreaCalculatorRedo calculate = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculate.getRoom();
        Rectangle bathroom = calculate.getRoom();

        double area = calculate.calculateTotalArea(kitchen,bathroom);

        System.out.println("The total area is : "+area);

        calculate.scanner.close();

    }
    public  Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length,width);
    }
    public double calculateTotalArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea()+room2.calculateArea();
    }
}


