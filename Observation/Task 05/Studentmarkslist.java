import java.util.*;

// Student class to store student details and perform calculations
class Student {

    int rollNo;
    String name;
    int marks[];

    Student(int rollNo, String name, int marks[]) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    int highestMarks() {
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            highest = Math.max(highest, marks[i]);
        }
        return highest;
    }

    int lowestMarks() {
        int lowest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            lowest = Math.min(lowest, marks[i]);
        }
        return lowest;
    }

    double calculatePercentage() {
        double percentage = (calculateTotal() / 500.0) * 100;
        return Math.round(percentage * 100.0) / 100.0;
    }

    String getGrade() {
        double p = calculatePercentage();

        if (p >= 90)
            return "A+";
        else if (p >= 80)
            return "A";
        else if (p >= 70)
            return "B";
        else if (p >= 60)
            return "C";
        else if (p >= 50)
            return "D";
        else
            return "F";
    }

    String getRemark() {
        String grade = getGrade();

        if (grade.equals("A+"))
            return "Outstanding";
        else if (grade.equals("A"))
            return "Excellent";
        else if (grade.equals("B"))
            return "Very Good";
        else if (grade.equals("C"))
            return "Good";
        else if (grade.equals("D"))
            return "Needs Improvement";
        else
            return "Failed";
    }

    void displayReport() {

        System.out.println(" STUDENT PERFORMANCE REPORT");
     
        System.out.println("Roll Number : " + rollNo);

        String formattedName = name.trim().toUpperCase();

        System.out.println("Student Name : " + formattedName);
        System.out.println("Name Length : " + formattedName.length());

        System.out.println("\nSubject Marks");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("\nTotal Marks : " + calculateTotal());
        System.out.println("Average : " + calculateAverage());
        System.out.println("Highest Marks : " + highestMarks());
        System.out.println("Lowest Marks : " + lowestMarks());
        System.out.println("Percentage : " + calculatePercentage() + "%");
        System.out.println("Grade : " + getGrade());

        if (calculatePercentage() >= 50)
            System.out.println("Result : PASS");
        else
            System.out.println("Result : FAIL");

        System.out.println("Remark : " + getRemark());
    }
}

public class StudentPerformanceAnalysis {

    public static void main(String args[]) {

        int marks[] = {95, 88, 76, 91, 84};

        Student s = new Student(200, "RAVI", marks);

        s.displayReport();
    }
}
