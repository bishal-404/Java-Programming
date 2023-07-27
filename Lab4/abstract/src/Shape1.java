// Abstract Shape class
abstract class Shape {
    // Abstract method to calculate the area
    public abstract double getArea();

    // Abstract method to calculate the perimeter
    public abstract double getPerimeter();

    // Non-abstract method
    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Concrete Rectangle class extending the abstract Shape class
class Rectangle extends Shape{
    private double width;
    private  double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //Implementation of abstract method of area
    public double getArea() {
        return width*height;
    }

    // implementation of abstract method of perimeter
    public double getPerimeter(){
        return 2*(width+height);
    }
}

// Concrete Circle class extending the abstract Shape class
class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    // Implementation of abstract method of area
    public double getArea(){
        return Math.PI*radius*radius;
    }

    // Implementaion of abstract method of perimeter
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}

//Usage
public class Shape1 {
    public static void main(String[]args){
        Rectangle rectangle = new Rectangle(5,10);
        Circle circle = new Circle(7);
        rectangle.displayInfo();
        System.out.println("rectangle Area: "+rectangle.getArea());
        System.out.println("rectangle Perimeter: "+rectangle.getPerimeter());

        circle.displayInfo();
        System.out.println("circle Area: "+circle.getArea());
        System.out.println("circle Perimeter: "+circle.getPerimeter());
    }
}
