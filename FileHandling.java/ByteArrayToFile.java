import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayToFile {
    public static void main(String[] args) {
        // Array of bytes (for example ASCII values of characters)
        byte[] data = {65, 66, 67, 68, 69};  // A B C D E

        try {
            // Create FileOutputStream to write to file
            FileOutputStream fos = new FileOutputStream("output.txt");

            // Write the whole byte array to the file
            fos.write(data);

            // Always close the stream
            fos.close();

            System.out.println("Byte array written successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
