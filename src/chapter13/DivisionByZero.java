package chapter13;

public class DivisionByZero {

    public static void main(String[] args) {
        try {
            int c = 30/0;
        }catch (ArithmeticException e){
            System.out.println("Division by zero isn't allowed");
        }finally {
            System.out.println("Division is Fun");
        }
    }
}
