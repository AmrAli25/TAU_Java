package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main (String args[]){
        int[] numbers = generateNumbers();
        Arrays.sort(numbers);
        printNumbers(numbers);



    }

    public static int[] generateNumbers(){
        int[] numbers = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i<LENGTH; i++) {
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;

            }while(seqSearch(numbers, randomNumber));
            numbers[i] = randomNumber;

        }
        return numbers;
    }
    public static void printNumbers(int[] numbers){
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(numbers[i]+" | ");

        }
    }

    /**
     * Search for a number in the array using sequential search
     * @param array
     * @param numToSearchFor
     * @return true if found and false if not found
     */
    public static boolean seqSearch(int[]array, int numToSearchFor){
        // this is an enhanced loop
        for(int value: array){
            if (value == numToSearchFor) {
                return true;
            }
        }
        return false;

    }

    public static boolean binSearch(int[] array, int numToSearchFor){
        // first array must be sorted
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numToSearchFor);
        if (index >= 0)
            return true;
        else
            return false;
    }
}
