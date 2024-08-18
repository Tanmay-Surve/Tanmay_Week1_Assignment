import java.util.ArrayList;
import java.util.Scanner;
class Student {
 private String name;
 private int id;
 public Student(String name, int id) {
 this.name = name;
 this.id = id;
 }
 public String getName() {
 return name;
 }
 public int getId() {
 return id;
 }
 @Override
 public String toString() {
 return "Student ID: " + id + ", Name: " + name;
 }
}
public class StudentManager {
 private ArrayList<Student> students;
 public StudentManager() {
 students = new ArrayList<>();
 }
 public void addStudent(String name, int id) {
 Student newStudent = new Student(name, id);
 students.add(newStudent);
 System.out.println("Student added: " + newStudent);
 }
 public void removeStudent(int id) {
 for (Student student : students) {
 if (student.getId() == id) {
 students.remove(student);
 System.out.println("Student removed: " + student);
 return;
 }
 }
 System.out.println("Student with ID " + id + " not found.");
 }
 public void displayStudents() {
 if (students.isEmpty()) {
 System.out.println("No students in the list.");
 } else {
 System.out.println("List of Students:");
 for (Student student : students) {
 System.out.println(student);
 }
 }
 }
 public static void main(String[] args) {
 StudentManager manager = new StudentManager();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nStudent Management Menu:");
 System.out.println("1. Add Student");
 System.out.println("2. Remove Student");
 System.out.println("3. Display Students");
 System.out.println("4. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter student name: ");
 String name = scanner.nextLine();
 System.out.print("Enter student ID: ");
 int id = scanner.nextInt();
 manager.addStudent(name, id);
 break;
 case 2:
 System.out.print("Enter student ID to remove: ");
 int removeId = scanner.nextInt();
 manager.removeStudent(removeId);
 break;
 case 3:
 manager.displayStudents();
 break;
 case 4:
 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");
 }
 } while (choice != 4);
 scanner.close();
 }
}
