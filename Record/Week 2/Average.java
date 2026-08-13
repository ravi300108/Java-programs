import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}
