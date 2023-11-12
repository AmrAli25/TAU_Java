package chapter7;

import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main (String args[]){
        int[] numbers = generateNumbers();
        printNumbers(numbers);



    }

    public static int[] generateNumbers(){
        int[] numbers = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i<LENGTH; i++)
            numbers[i] = random.nextInt(MAX_TICKET_NUMBER)+ 1;
        return numbers;
    }
    public static void printNumbers(int[] numbers){
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(numbers[i]+" | ");

        }
    }

}
