// write a java program to convert a decimal number to an octal number
import java.util.*;

public class convertToOctal{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number to convert to octal number: ");
        int a=scan.nextInt();
        String octaString = Integer.toOctalString(a);
        System.out.println(octaString);
    }

}