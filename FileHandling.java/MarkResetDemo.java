import java.io.*;

public class MarkResetDemo {
    public static void main(String[] args) throws Exception {

        String text = "Java Streams Example";

        // BufferedReader created using StringReader (for demonstration)
        BufferedReader br = new BufferedReader(new StringReader(text));

        System.out.println("Mark Supported: " + br.markSupported());

        // Read first 5 characters
        for (int i = 0; i < 5; i++) {
            System.out.print((char) br.read());
        }

        // Mark the current position
        br.mark(100);  // can read up to 100 chars before reset
        System.out.println("\nPosition marked.");

        // Read next 7 characters
        for (int i = 0; i < 7; i++) {
            System.out.print((char) br.read());
        }

        // Reset to marked position
        br.reset();
        System.out.println("\nAfter reset():");

        // Read again from marked position
        for (int i = 0; i < 7; i++) {
            System.out.print((char) br.read());
        }

        br.close();
    }
}
