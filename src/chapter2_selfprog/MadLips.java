package chapter2_selfprog;

import java.util.Scanner;

public class MadLips {
    public static void  main(String arg[]) {
        System.out.println("Enter a season of the Year .");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        System.out.println("Enter a Number.");
        int number = scanner.nextInt();
        System.out.println("Enter an adjective.");
        String adj = scanner.next();
        System.out.println("On a "+ adj +" "+ season + " day, i drink a minimum of " + number + " cups of coffee");
        scanner.close();
    }

}
