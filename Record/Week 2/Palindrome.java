import java.util.Scanner;

public class PrimePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (count == 2 && num == rev)
            System.out.println("Prime Palindrome");
        else
            System.out.println("Not a Prime Palindrome");

        sc.close();
    }
}
