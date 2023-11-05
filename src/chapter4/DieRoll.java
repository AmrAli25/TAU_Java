package chapter4;

import java.util.Random;

public class DieRoll {
    public static void main(String args[]){
        int spaces = 20;
        int total = 0;
        Random random = new Random();
        System.out.println("Welcome to Roll the Die! Let's begin...");
        for (int i = 1; i<=5; i++){
            int die = random.nextInt(6)+1;
            total += die;
            System.out.printf("Roll #%d: You've rolled a %d. %n", i, die);

            if (total == spaces){
                System.out.printf("You're on space %d Congrats, you win!%n", total);
                break;
            } else if (total > spaces) {
                System.out.printf("Unfortunately, that takes you past %d spaces. You lose!%n", spaces);
                break;
            } else if (i==5 && (total < spaces)) {
                System.out.printf("You're on space %d.%n", total);
                System.out.printf("Unfortunately, you didn't make it to all %d spaces. You lose!%n", spaces);
            }else {
                System.out.printf("You are now on space %d and have %d more to go.%n", total, (spaces-total));
            }
        }
    }
}
