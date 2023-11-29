package chapter14;

import java.util.Random;

public class Coin {

    private String side;
    public static String heads = "Heads";
    public static String tails = "Tails";

    public String getSide(){
        return side;
    }
    public void setSide(String side){
        this.side = side;
    }

    public String flip(){
        Random toss = new Random();
        if (toss.nextBoolean())
            setSide(heads);
        else
            setSide(tails);
        return getSide();
    }

}
