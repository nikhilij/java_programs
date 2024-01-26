import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string to reverse : ");
        String string = scan.nextLine();

        StringBuilder reverse_str= new StringBuilder(string);
        reverse_str.reverse();
        
        String reversedstring =reverse_str.toString();

        System.out.println(reversedstring);

    }
}
