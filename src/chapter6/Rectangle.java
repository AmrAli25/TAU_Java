package chapter6;

public class Rectangle {
    private double length,width;
    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }
    public double calculateArea(){
        return (length*width);
    }
}
