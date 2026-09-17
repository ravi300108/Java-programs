package core_java;

import java.util.Scanner;

public class UniqueString {

    static String getLongest(String text) {

        String answer = "";

        for (int start = 0; start < text.length(); start++) {

            String temp = "";

            for (int end = start; end < text.length(); end++) {

                char letter = text.charAt(end);

                // Check for duplicate character
                if (temp.indexOf(letter) >= 0) {
                    break;
                }

                temp += letter;

                // Compare current substring with previous result
                if (temp.length() >= answer.length()) {
                    answer = temp;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String result = getLongest(text);

        System.out.println("Longest length: " + result.length());
        System.out.println("Longest substring: " + result);

        input.close();
    }
}
