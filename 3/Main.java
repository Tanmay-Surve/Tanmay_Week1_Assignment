import java.util.Scanner;
abstract class Shape {
 abstract double area();
}
class Circle extends Shape {
 private double radius;
 public Circle(double radius) {
 this.radius = radius;
 }
 @Override
 double area() {
 return Math.PI * radius * radius;
 }
}
class Rectangle extends Shape {
 private double length;
 private double width;
 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 @Override
 double area() {
 return length * width;
 }
}
class Triangle extends Shape {
 private double base;
 private double height;
 public Triangle(double base, double height) {
 this.base = base;
 this.height = height;
 }
 @Override
 double area() {
 return 0.5 * base * height;
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter radius of the circle: ");
 double radius = scanner.nextDouble();
 Shape circle = new Circle(radius);
 System.out.println("Area of the circle: " + circle.area());
 System.out.print("Enter length and width of the rectangle: ");
 double length = scanner.nextDouble();
 double width = scanner.nextDouble();
 Shape rectangle = new Rectangle(length, width);
 System.out.println("Area of the rectangle: " + rectangle.area());
 System.out.print("Enter base and height of the triangle: ");
 double base = scanner.nextDouble();
 double height = scanner.nextDouble();
 Shape triangle = new Triangle(base, height);
 System.out.println("Area of the triangle: " + triangle.area());
 scanner.close();
 }
}
