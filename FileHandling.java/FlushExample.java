import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FlushExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("flush_example.txt"));
            
            bw.write("This is a test using flush.\n");
            
            // Flush the data to file without closing
            bw.flush();
            System.out.println("Data flushed to file successfully.");

            bw.write("Adding more data after flush.\n");
            
            // Close the stream
            bw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

