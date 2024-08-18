class Rectangle {
 private double length;
 private double width;
 // Constructor with two parameters
 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 // Constructor with one parameter (for square)
 public Rectangle(double side) {
 this.length = side;
 this.width = side;
 }
 // Method to calculate area with length and width
 public double area() {
 return length * width;
 }
 // Overloaded method to calculate area using a single parameter
 public double area(double side) {
 return side * side;
 }
 public void display() {
 System.out.println("Length: " + length + ", Width: " + width);
 System.out.println("Area: " + area());
 }
}
public class Main {
 public static void main(String[] args) {
 Rectangle rectangle1 = new Rectangle(5.0, 3.0);
 Rectangle rectangle2 = new Rectangle(4.0); // Square
 rectangle1.display();
 rectangle2.display();
 // Using the overloaded area method
 double areaOfSquare = rectangle2.area(4.0);
 System.out.println("Area of the square with side 4.0: " + areaOfSquare);
 }
}
