import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LetterCombinations {
 static String[] phone = {
 "", "", "abc", "def", "ghi", "jkl",
 "mno", "pqrs", "tuv", "wxyz"
 };
 static List<String> result = new ArrayList<>();
 static void generate(String digits, int index, String current) {
 // Store the combination when all digits are processed
 if (index == digits.length()) {
 result.add(current);
 return;
 }
 int digit = digits.charAt(index) - '0';
 String letters = phone[digit];
 // Try every letter mapped to the current digit
 for (int i = 0; i < letters.length(); i++) {
 generate(digits, index + 1,
 current + letters.charAt(i));
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter digits: ");
 String digits = sc.nextLine();
   if (digits.isEmpty()) {
 System.out.println("Output: []");
 } else {
 boolean valid = true;
 for (int i = 0; i < digits.length(); i++) {
 if (digits.charAt(i) < '2' ||
 digits.charAt(i) > '9') {
 valid = false;
 break;
 }
 }
 if (valid) {
 result.clear();
 generate(digits, 0, "");
 System.out.println("Output: " + result);
 } else {
 System.out.println(
 "Enter digits from 2 to 9 only."
 );
 }
 }
 sc.close();
 }
}
