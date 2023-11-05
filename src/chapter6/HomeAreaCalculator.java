package chapter6;

public class HomeAreaCalculator {
    public static void main(String args[]){
        Rectangle room1 = new Rectangle(50,25);
        double areaOfٍRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();
        double totalArea = areaOfRoom2 + areaOfٍRoom1;

        System.out.printf("Area of both rooms: %.2f", totalArea);

    }
}
