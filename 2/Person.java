class Person {
 private String name;
 private int age;
 public Person(String name, int age) {
 this.name = name;
 this.age = age;
 }
 public void displayAttributes() {
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 }
}
public class Main {
 public static void main(String[] args) {
 Person person1 = new Person("Alice", 30);
 Person person2 = new Person("Bob", 25);
 person1.displayAttributes();
 person2.displayAttributes();
 }
}