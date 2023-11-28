package chapter11;

public class Farm {

    public static void main(String[] args) {
        Animal donald = new Duck();
        donald.eat();
        donald.makeSound();

        Animal tweety = new Bird();
        tweety.eat();
        tweety.makeSound();
    }
}
