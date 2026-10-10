import java.io.*;
public class FileHandling {
 public static void main(String[] args) {
 String text = "Peter Piper picked a peck of pickled peppers\n"
 + "A peck of pickled peppers Peter Piper picked\n"
 + "If Peter Piper picked a peck of pickled peppers\n"
 + "Where's the peck of pickled peppers Peter Piper picked?";
 try {
 // Write the text into sample.txt
 FileWriter fw = new FileWriter("sample.txt");
 fw.write(text);
 fw.close();
 // Read the contents of sample.txt
 BufferedReader br = new BufferedReader(
 new FileReader("sample.txt"));
 StringBuilder content = new StringBuilder();
 String line;
 while ((line = br.readLine()) != null) {
 content.append(line).append("\n");
 }
 br.close();
 // Count occurrences of pe and pi
 String data = content.toString().toLowerCase();
 int peCount = 0;
 int piCount = 0;
 for (int i = 0; i < data.length() - 1; i++) {
 String pattern = data.substring(i, i + 2);
 if (pattern.equals("pe")) {
 peCount++;
 }
 if (pattern.equals("pi")) {
 piCount++;
 }
 }
 System.out.println("'pe' - no of occurrences - " + peCount);
 System.out.println("'pi' - no of occurrences - "
 + piCount);
 } catch (IOException e) {
 System.out.println("An error occurred: "
 + e.getMessage());
 }
 }
}
