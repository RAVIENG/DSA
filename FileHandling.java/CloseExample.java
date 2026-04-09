import java.io.*;

public class CloseExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("close_example.txt"));
            
            bw.write("This line will be written using close.\n");
            
            // Close the stream (automatically flushes too)
            bw.close();
            System.out.println("Data written and file closed successfully.");
            
            // bw.write("This will cause error"); // Uncommenting this will throw IOException
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 {
    
}
