package studentutility;
import java.util.Scanner;

public class StudentUtilityProgram {
	// Part A: basics
	public static void displayInfo(String name, int roll,int[] marks) {
		int total = calTotal(marks);
		double percentage = calPercentage(total, marks.length);
		System.out.println("\nStudent information : ");
        System.out.println("Name of the student: " + name);
        System.out.println("Roll number: " + roll);
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage );
        displayResult(percentage);
	}
    public static int calTotal(int[] marks) {
    	int total = 0;
    	for(int m : marks)
    	total += m;
    	return total;
    }
    public static double calPercentage( int total, int subjects) {
    	return (double) total / subjects;
		
	}
    // conditional statements 
    
    public static void evenOdd(int num) {
    	System.out.println(num % 2 == 0 ? num + " is Even" : num + " is Odd");
    }
    public static void findLargest(int a, int b, int c) {
    	 int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
         System.out.println("Largest number is: " + largest);
		
	} 
    public static void displayResult(double percentage) {
        if (percentage >= 90) System.out.println("Grade: A+");
        else if (percentage >= 75) System.out.println("Grade: A");
        else if (percentage >= 60) System.out.println("Grade: B");
        else if (percentage >= 40) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");
    }
    public static void dayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number!");
        }
    }
    // Loops
    public static void printTable(int num) {
        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void displayNumbers(int N) {
        for (int i = 1; i <= N; i++) System.out.print(i + " ");
        System.out.println();
    }

    public static void sumNaturalNumbers(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) sum += i;
        System.out.println("Sum of first " + N + " natural numbers = " + sum);
    }
    public static void fibonacciSeries(int N) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    // methods: with parameters and return value
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        return fact;
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true; 
    }

    public static int maxOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius; 
    }
    
    // call each method from main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Utility Program ---");
            System.out.println("1. Student Info");
            System.out.println("2. Even/Odd Check");
            System.out.println("3. Largest of Three Numbers");
            System.out.println("4. Display Grade");
            System.out.println("5. Day of Week");
            System.out.println("6. Multiplication Table");
            System.out.println("7. Display Numbers 1 to N");
            System.out.println("8. Sum of Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Prime Check");
            System.out.println("12. Max of Two Numbers");
            System.out.println("13. Area of Circle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            
            switch (choice) {
            case 1:
                sc.nextLine(); // consume newline
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                int[] marks = new int[3];
                System.out.println("Enter 3 subject marks:");
                for (int i = 0; i < 3; i++) marks[i] = sc.nextInt();
                displayInfo(name, roll, marks);
                break;

            case 2:
                System.out.print("Enter number: ");
                evenOdd(sc.nextInt());
                break;

            case 3:
                System.out.print("Enter three numbers: ");
                findLargest(sc.nextInt(), sc.nextInt(), sc.nextInt());
                break;
                
            case 4:
                System.out.print("Enter percentage: ");
                displayResult(sc.nextDouble());
                break;

            case 5:
                System.out.print("Enter day number (1-7): ");
                dayOfWeek(sc.nextInt());
                break;

            case 6:
                System.out.print("Enter number: ");
                printTable(sc.nextInt());
                break;

            case 7:
                System.out.print("Enter N: ");
                displayNumbers(sc.nextInt());
                break;

            case 8:
                System.out.print("Enter N: ");
                sumNaturalNumbers(sc.nextInt());
                break;
                
            case 9:
                System.out.print("Enter N: ");
                fibonacciSeries(sc.nextInt());
                break;

            case 10:
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                System.out.println("Factorial = " + factorial(num));
                break;

            case 11:
                System.out.print("Enter number: ");
                int primeNum = sc.nextInt();
                System.out.println(primeNum + (isPrime(primeNum) ? " is Prime" : " is Not Prime"));
                break;

            case 12:
                System.out.print("Enter two numbers: ");
                System.out.println("Max = " + maxOfTwo(sc.nextInt(), sc.nextInt()));
                break;

            case 13:
                System.out.print("Enter radius: ");
                System.out.println("Area = " + areaOfCircle(sc.nextDouble()));
                break;

            case 0:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    } while (choice != 0);

    sc.close();
    }}
 
