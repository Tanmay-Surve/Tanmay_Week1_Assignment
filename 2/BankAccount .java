import java.util.Scanner;
class BankAccount {
 private double balance;
 public BankAccount() {
 balance = 0.0;
 }
 public void deposit(double amount) {
 if (amount > 0) {
 balance += amount;
 System.out.println("Deposited: $" + amount);
 } else {
 System.out.println("Deposit amount must be positive.");
 }
 }
 public void withdraw(double amount) {
 if (amount > 0 && amount <= balance) {
 balance -= amount;
 System.out.println("Withdrawn: $" + amount);
 } else if (amount > balance) {
 System.out.println("Insufficient funds for withdrawal.");
 } else {
 System.out.println("Withdrawal amount must be positive.");
 }
 }
 public void displayBalance() {
 System.out.println("Current balance: $" + balance);
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 BankAccount account = new BankAccount();
 int choice;
 do {
 System.out.println("\nBank Account Menu:");
 System.out.println("1. Deposit");
 System.out.println("2. Withdraw");
 System.out.println("3. Display Balance");
 System.out.println("4. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 switch (choice) {
 case 1:
 System.out.print("Enter amount to deposit: ");
 double depositAmount = scanner.nextDouble();
 account.deposit(depositAmount);
 break;
 case 2:
 System.out.print("Enter amount to withdraw: ");
 double withdrawAmount = scanner.nextDouble();
 account.withdraw(withdrawAmount);
 break;
 case 3:
 account.displayBalance();
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
