package core_java;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFound {
public static void main(String[] args) {
try {
File file = new File("missing_file.txt");
FileReader fr = new FileReader(file);
} catch (FileNotFoundException e) {
System.err.println("Caught FileNotFoundException: File could not be located.");
}
}
}
