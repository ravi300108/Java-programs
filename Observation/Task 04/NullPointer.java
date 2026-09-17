public class smtg {
    public static void main(String[] args) {
        String name = null; 
        try {
            System.out.println("The length of the name is: " + name.length());
        } catch(NullPointerException e) {
            System.out.println("string is null");
        }
    }
}
