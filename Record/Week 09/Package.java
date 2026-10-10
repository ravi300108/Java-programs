package number;
public class Roman {
 public int romanToInteger(String s) {
 int result = 0;
 int previous = 0;
 for (int i = s.length() - 1; i >= 0; i--) {
 int value = 0;
 switch (s.charAt(i)) {
 case 'I': value = 1; break;
 case 'V': value = 5; break;
 case 'X': value = 10; break;
 case 'L': value = 50; break;
 case 'C': value = 100; break;
 case 'D': value = 500; break;
 case 'M': value = 1000; break;
 }
 if (value < previous) {
 result -= value;
 } else {
 result += value;
 }
 previous = value;
 }
 return result;
 }
}
File 2: RomanDemo.java
import number.Roman;
public class RomanDemo {
 public static void main(String[] args) {
 Roman obj = new Roman();
 String roman = "LVIII";
 int result = obj.romanToInteger(roman);
 System.out.println("Roman Numeral: " + roman);
 System.out.println("Integer Value: " + result);
 }
}

