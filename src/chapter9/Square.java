package chapter9;

public class Square  extends Rectangle{
    @Override
    public double calculatePrem() {
        return sides * length;
    }
}
