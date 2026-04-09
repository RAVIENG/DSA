import java.io.File;

public class CreateDirectoryExample {
    public static void main(String[] args) {
        // Directory path
        String dirName = "MyFolder";

        // Create File object for the directory
        File dir = new File(dirName);

        // Check if directory exists
        if (!dir.exists()) {
            // Create directory
            if (dir.mkdir()) {
                System.out.println("Directory created successfully: " + dirName);
            } else {
                System.out.println("Failed to create directory: " + dirName);
            }
        } else {
            System.out.println("Directory already exists: " + dirName);
        }
    }
}
