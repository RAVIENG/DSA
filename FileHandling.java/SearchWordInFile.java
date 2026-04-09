import java.io.*;

public class SearchWordInFile {
    public static void main(String[] args) {
        String fileName = "sample.txt";   // file to search in
        String searchWord = "Java";       // word to search

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int lineNumber = 0;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchWord)) {  // check if line contains word
                    System.out.println("Word found at line: " + lineNumber);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Word not found in the file.");
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
