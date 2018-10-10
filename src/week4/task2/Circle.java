package week4.task2;


public class Circle extends Shape {
    final double PI = (double) 3.14;
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //tinh dien tich
    public double getArea() {
        return PI * getRadius() * getRadius();


    }

    //tinh chu vi
    public double getPerimeter() {
        return 2 * PI * getRadius();

    }

    public String toString() {
        return "Cicle";
    }
}
