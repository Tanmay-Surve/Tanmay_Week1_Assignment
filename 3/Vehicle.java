class Vehicle {
public void start() {
 System.out.println("Vehicle is starting.");
 }
 public void stop() {
 System.out.println("Vehicle is stopping.");
 }
}
class Car extends Vehicle {
 @Override
 public void start() {
 System.out.println("Car is starting with a key.");
 }
 @Override
 public void stop() {
 System.out.println("Car is stopping with brakes.");
 }
}
class Bike extends Vehicle {
 @Override
 public void start() {
 System.out.println("Bike is starting with a push button.");
 }
 @Override
 public void stop() {
 System.out.println("Bike is stopping with rear brakes.");
 }
}
public class Main {
 public static void main(String[] args) {
 Vehicle myVehicle;
 myVehicle = new Car();
 myVehicle.start();
 myVehicle.stop();
 myVehicle = new Bike();
 myVehicle.start();
 myVehicle.stop();
 }
}
