package chapter14;

import java.util.Scanner;

public class CoinTossGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Set player1 Name
        Player player1 = new Player(getPlayerName());
        // Set player1 Guess
        player1.setGuess(askGuess());
        // Set player2 Name
        Player player2 = new Player(getPlayerName());

        // check player 1 chose Heads or Tails and assign the other to player 2
        if (player1.getGuess().equalsIgnoreCase(Coin.heads))
            player2.setGuess(Coin.tails);
        else
            player2.setGuess(Coin.heads);
        // do the coin flip
        System.out.println("Flipping the coin ......");
        Coin coin = new Coin();
        coin.flip();
        if (coin.getSide().equalsIgnoreCase(player1.getGuess()))
            System.out.println(String.format("The coin is %s --->> Congrats (%s) You are the winner",coin.getSide(),player1.getName()));
        else
            System.out.println(String.format("The coin is %s --->> Congrats (%s) You are the winner",coin.getSide(),player2.getName()));



    }

    private static String askGuess() {
        System.out.println(Coin.heads + " or " + Coin.tails + " ?");
        String guess = scanner.nextLine();
        while (!guess.equalsIgnoreCase(Coin.heads) && !guess.equalsIgnoreCase(Coin.tails)){
            System.out.println(String.format("Invalid guess, enter another guess: %s or %s ?", Coin.heads, Coin.tails));
            guess = scanner.nextLine();
        }
        return guess;
    }

    private static String getPlayerName() {
        System.out.println("Enter Player's name:");
        return scanner.nextLine();


    }
}
