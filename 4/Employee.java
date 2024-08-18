import java.util.HashMap;
import java.util.Scanner;
class Employee {
 private String name;
 private String department;
 public Employee(String name, String department) {
 this.name = name;
 this.department = department;
 }
 @Override
 public String toString() {
 return "Name: " + name + ", Department: " + department;
 }
}
public class EmployeeManager {
 private HashMap<Integer, Employee> employeeMap;
 public EmployeeManager() {
 employeeMap = new HashMap<>();
 }
 public void addEmployee(int id, String name, String department) {
 Employee employee = new Employee(name, department);
 employeeMap.put(id, employee);
 System.out.println("Employee added: ID = " + id + ", " + employee);
 }
 public void getEmployee(int id) {
 Employee employee = employeeMap.get(id);
 if (employee != null) {
 System.out.println("Employee details: ID = " + id + ", " + employee);
 } else {
 System.out.println("Employee with ID " + id + " not found.");
 }
 }
 public static void main(String[] args) {
 EmployeeManager manager = new EmployeeManager();
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 System.out.println("\nEmployee Management Menu:");
 System.out.println("1. Add Employee");
 System.out.println("2. Get Employee Details");
 System.out.println("3. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter employee ID: ");
 int id = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 System.out.print("Enter employee name: ");
 String name = scanner.nextLine();
 System.out.print("Enter employee department: ");
 String department = scanner.nextLine();
 manager.addEmployee(id, name, department);
 break;
 case 2:
 System.out.print("Enter employee ID to retrieve details: ");
 int searchId = scanner.nextInt();
 manager.getEmployee(searchId);
 break;
 case 3:
 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");
 }
 } while (choice != 3);
 scanner.close();
 }
}