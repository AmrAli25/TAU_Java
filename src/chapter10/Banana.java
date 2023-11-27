package chapter10;

public class Banana extends Fruit{
    public Banana(){
        setCalories(98);
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made");
    }
    public void peel(){
        System.out.println("peeling the banana");
    }
}
