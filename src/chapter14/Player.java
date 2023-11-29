package chapter14;

public class Player {

    private String name, guess;

    public Player(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGuess(String guess){
        this.guess = guess;
    }
    public String getGuess(){
        return guess;
    }
}
