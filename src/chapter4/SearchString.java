package chapter4;

import java.util.Scanner;

public class SearchString {
    public static void main(String args[]) {
        System.out.println("Enter your text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();
        boolean flag = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("The text you entered contains the letter A");
        else
            System.out.println("The text you entered doesn't contain the letter A");

    }
}

