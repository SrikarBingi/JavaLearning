package Interfaces;
class Circle implements Shape{
    private double radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double claculateArea() {
        // TODO Auto-generated method stub
        return Math.PI*radius*radius;
    }
    
}
class Rectangle implements Shape{

    private int length;
    private int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double claculateArea() {
        // TODO Auto-generated method stub
        return length*width;
    }
    
}
public class ShapeInterfaceExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 8);

        System.out.println("Circle Area : "+circle.claculateArea());
        System.out.println("Rectangle Area :"+rectangle.claculateArea());
    }
}
