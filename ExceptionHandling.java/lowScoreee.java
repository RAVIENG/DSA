// Custom Exception
class LowScoreException extends Exception {
    LowScoreException(String message) {
        super(message);
    }
}

// Main class
public class lowScoreee {

    // Method to check marks
    public static void checkMarks(int marks) throws LowScoreException {
        if (marks < 40) {
            throw new LowScoreException("Marks are below 40");
        } else {
            System.out.println("Marks accepted: " + marks);
        }
    }

    public static void main(String[] args) {
        try {
            checkMarks(35);  // test input
        } catch (LowScoreException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program ended. Exception handled successfully.");
        }
    }
}
