package ict301.solid.ocp;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4, 3);
        System.out.println("Area = '" + shape.calculateArea() + "'");
        
        Shape circle = new Circle(5);
        System.out.println("Circle Area = '" + circle.calculateArea() + "'");
    }
}