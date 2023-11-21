package chapter8;

import java.util.Scanner;

public class ValidatePasswordStrength {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean valid;
    public static void main(String[] args) {
        System.out.println("Enter your username:");
        String userName = scanner.nextLine();
        System.out.println("Enter the Old password:");
        String oldPassword = scanner.nextLine();
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
        do {
            System.out.println("Enter the New password:");
            String newPassword = scanner.nextLine();
            if (newPassword.equals(oldPassword)) {
                System.out.println("New password mustn't be the same as old password");
                valid = false;
            }
            else if(newPassword.toUpperCase().contains(userName.toUpperCase())) {
                System.out.println("New password mustn't contain username in it");
                valid = false;
            }
            else
                checkNewPasswordStrength(newPassword);

        }while (!valid);

    }

    /**
     * Check if the new password is valid or not (8 chars long , contains Upper case letter, lower case letters and special letters
     * @param newPassword the new password to be checked
     * @return true if valid false if not valid
     */
    public static boolean checkNewPasswordStrength(String newPassword){
        if (newPassword.length()<8){
            System.out.println("New password minimum length is 8 characters");
            return (valid = false);
        }
        else if (newPassword.equals(newPassword.toLowerCase())) {
            System.out.println("The new password must contain Upper characters");
            return valid = false;
        }
        else if (newPassword.matches("[a-zA-Z0-9]*")) {
            System.out.println("The new password must contain special characters");
            return valid = false;
        }
        else
            System.out.println("The Password have been updated");
        return valid = true;
    }
    public static void rulesForNewPassword(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }
}
