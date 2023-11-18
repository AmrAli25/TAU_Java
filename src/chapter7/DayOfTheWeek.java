package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number (1 - 7) of the day assuming the week start from Monday");
        int day = scanner.nextInt();
        if (day >= 1 && day <= 7)
            System.out.println("The day is: " + days[day-1]);
        else
            System.out.println("Wrong number ");
    }

}
