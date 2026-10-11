import java.util.Scanner;
// User-defined exception
class LengthNotSufficientException extends Exception {
 public LengthNotSufficientException(String message) {
 super(message);
 }
}
public class MobileValidator {
 static void validateMobile(String number)
 throws LengthNotSufficientException {
 // Check whether all characters are digits
 for (int i = 0; i < number.length(); i++) {
 if (!Character.isDigit(number.charAt(i))) {
 throw new NumberFormatException();
 }
 }
 // Check whether the number exceeds 10 digits
 if (number.length() > 10) {
 throw new ArrayIndexOutOfBoundsException();
 }
 // Check whether the number has fewer than 10 digits
 if (number.length() < 10) {
 throw new LengthNotSufficientException(
 "Invalid Mobile Number - LengthNotSufficientException");
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter mobile number: ");
 String number = sc.nextLine();
 try { validateMobile(number);
 System.out.println("Valid number");
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println(
 "Invalid Mobile Number-ArrayIndexOutOfBounds Exception");
 } catch (LengthNotSufficientException e) {
 System.out.println(e.getMessage());
 } catch (NumberFormatException e) {
 System.out.println(
 "Invalid Mobile Number -NumberFormatException");
 } finally {
 sc.close();
 }
 }
}
