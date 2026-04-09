class CheckVowelContain extends Exception {
    CheckVowelContain(String message) {
        super(message);
    }
}

public class vowal {

    public static void check(String str) throws CheckVowelContain {
        str = str.toLowerCase();

        // Correct condition: if NO vowels are found
        if (!(str.contains("a") || str.contains("e") || 
              str.contains("i") || str.contains("o") || 
              str.contains("u"))) {

            throw new CheckVowelContain("String does not contain any vowel!");
        } else {
            System.out.println("String contains vowel(s).");
        }
    }

    public static void main(String[] args) {
        try {
            check("check vowal");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
