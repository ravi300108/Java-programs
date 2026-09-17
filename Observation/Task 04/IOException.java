package exceptionhandling;
import java.io.FileReader;
import java.io.IOException;
public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("student.txt");
            System.out.println("File Opened Successfully");
            file.close();
        } catch (IOException e) {
            System.out.println("Input/Output Error");
        }
        System.out.println("Program Continues");
    }
}
