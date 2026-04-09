import java.io.*;

public class SimpleMerge {
    public static void main(String[] args) {

        StringBuilder merge = new StringBuilder();

        // ---- Read File 1 using FileInputStream (byte stream) ----
        try (FileInputStream fis = new FileInputStream("file1.txt")) {
            int b;
            while ((b = fis.read()) != -1) {
                merge.append((char) b);  // add to merge
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // ---- Read File 2 using BufferedReader (character stream) ----
        try (BufferedReader br = new BufferedReader(new FileReader("file2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                merge.append(line).append("\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // ---- Read File 3 using DataInputStream (read numbers) ----
        try (DataInputStream dis = new DataInputStream(new FileInputStream("file3.dat"))) {
            while (dis.available() > 0) {
                int num = dis.readInt();   // read integer
                merge.append(num).append(" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // ---- Write merged data to one output file ----
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(merge.toString().getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Files merged successfully!");
    }
}
