import java.util.Scanner;
// Custom Exception
class InvalidInputException extends Exception {
 public InvalidInputException(String message) {
 super(message);
 }
}
public class ExceptionHandlingExample {
 
 public static double divide(int a, int b) throws ArithmeticException {
 return a / b;
 }
 public static void validateInput(String input) throws InvalidInputException {
 if (input == null || input.trim().isEmpty()) {
 throw new InvalidInputException("Input cannot be null or empty.");
 }
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int numerator, denominator;
 String input;
 try {
 System.out.print("Enter numerator: ");
 input = scanner.nextLine();
 validateInput(input);
 numerator = Integer.parseInt(input);
 
 System.out.print("Enter denominator: ");
 input = scanner.nextLine();
 validateInput(input);
 denominator = Integer.parseInt(input);
 double result = divide(numerator, denominator);
 System.out.println("Result: " + result);
 
 } catch (ArithmeticException e) {
 System.out.println("Error: Cannot divide by zero.");
 } catch (NumberFormatException e) {
 System.out.println("Error: Invalid number format.");
 } catch (InvalidInputException e) {
 System.out.println("Error: " + e.getMessage());
 } catch (NullPointerException e) {
 System.out.println("Error: A null value was encountered.");
 } catch (Exception e) {
 System.out.println("An unexpected error occurred: " + e.getMessage());
 } finally {
 scanner.close();
 }
 }
}