package javaprograms;
import java.util.Scanner;
public class Student_utility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
	do {
		System.out.println(" Student utility");
		System.out.println("1. Student information");
		System.out.println("2.conditional statements");
		System.out.println("3.looping statements");
		System.out.println("4.Exit");
		System.out.print("Enter your choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("\n--Student information--\n");
			System.out.println("Enter your name: ");
			String name=sc.next();
			System.out.println("Roll no.");
			int roll=sc.nextInt();
			System.out.println("Enter marks of 2 subjects");
			int m=sc.nextInt();int p=sc.nextInt();
			int total=m+p;
			float perc=(total/200.0F)*100;
			System.out.println("Student name: "+name);
			System.out.println("Roll no.: "+roll);
			System.out.println("Total: "+total);
			System.out.println("percentage: "+perc);
			break;
		case 2:
			System.out.println("\n--conditinal statements--\n");
			System.out.println("Grade based on percentage");
			System.out.print("Enter percentage: ");
			float prct=sc.nextFloat();
			if(prct>=90) {
				System.out.println("Grade A");}
			else if(prct>=80) {
				System.out.println("Grade B");}
			else if(prct>=60) {
				System.out.println("Grade C");}
			else if(prct>=35) {
				System.out.println("Grade D");}
			else {
				System.out.println("Fail");}
			break;
		case 3:
			System.out.println("\n--looping statements--\n");
		    System.out.println("1.Sum of first N numbers");
		    System.out.println("2.Display n numbers");
            int loop=sc.nextInt();
            switch(loop) {
            case 1:
            	System.out.println("Enter n: ");
            	int N=sc.nextInt();
            	int sum=0;
            	for(int i=1;i<=N;i++) {
            		sum=sum+i;
            	}
            	System.out.println("Sum is: "+sum);
            	break;
            case 2:
            	System.out.println("Enter n: ");
            	int n=sc.nextInt();
            	for(int i=1;i<=n;i++) {
            	System.out.print(i +"");}
            	System.out.println();
            	break;
            }
            break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid option");
			
            }

}while(choice!=4)
		);
	sc.close();
	}
	}

