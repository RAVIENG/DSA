import java.io.*;

public class ByteToCharExample {
    public static void main(String[] args) {
        try {
            // Step 1: Create a file with some text
            FileOutputStream fos = new FileOutputStream("input.txt");
            String data = "Hello, this is a sample text.\nWelcome to Java!";
            fos.write(data.getBytes());
            fos.close();

            // Step 2: Read the file using InputStreamReader
            FileInputStream fis = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(fis); // converts bytes to chars
            BufferedReader br = new BufferedReader(isr);

            // Step 3: Read line by line
            String line;
            System.out.println("Reading file using InputStreamReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
