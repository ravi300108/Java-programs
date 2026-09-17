package core_java;
public class ClassCastExample {
public static void main(String[] args) {
try {
Object obj = "This is a string";
Integer num = (Integer) obj; // Cannot cast String to Integer
} catch (ClassCastException e) {
System.err.println("Caught ClassCastException: Incompatible type casting attempted.");
}
}
}
