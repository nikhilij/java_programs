import java.util.*;

public class CapitalizeLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String line = scan.nextLine();

        String uppercase = "";
        Scanner linescan = new Scanner(line);
        while (linescan.hasNext()) {
            String word = linescan.next();
            uppercase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(uppercase.trim());
    }
}
