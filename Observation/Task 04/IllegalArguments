package observation;

public class smtg {
    public static void main(String[] args) {
        int volume = -10;
        try {
            if (volume < 0) {
                throw new IllegalArgumentException("Volume is too low!");
            }
            System.out.println("Volume set to: " + volume);
        } catch (IllegalArgumentException e) {
            System.out.println("Error fixed: " + e.getMessage());
            volume = 0;
            System.out.println("Volume reset to safe level: " + volume);
        }
    }
}
