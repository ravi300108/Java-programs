import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses {
 public static boolean isValid(String s) {
 Stack<Character> stack = new Stack<>();
 for (int i = 0; i < s.length(); i++) {
 char ch = s.charAt(i);
 // Push opening brackets onto the stack
 if (ch == '(' || ch == '{' || ch == '[') {
 stack.push(ch);
 } else {
 if (stack.isEmpty()) {
 return false;
 }
 char top = stack.pop();
 // Check whether the brackets match
 if ((ch == ')' && top != '(') ||
 (ch == '}' && top != '{') ||
 (ch == ']' && top != '[')) {
 return false;
 }
 }
 }
 return stack.isEmpty();
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the string: ");
 String s = sc.nextLine(); if (isValid(s)) {
 System.out.println("Output: Valid");
 } else {
 System.out.println("Output: Not Valid");
 }
 sc.close();
 }
}

