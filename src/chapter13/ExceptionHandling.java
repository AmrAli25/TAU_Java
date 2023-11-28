package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        //createNewFile();
        numbersExceptionHandling();
    }

    private static void numbersExceptionHandling() {
        File file = new File("resources/nothing.txt");
        Scanner fileReader = null;
        try(Scanner scanner = new Scanner(file)){
            while (fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("No file found");
            e.printStackTrace();
        }
    }

    private static void createNewFile() {
        File file = new File("resources/nothing.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("This is an exception error");
            e.printStackTrace();
        }
    }
}
