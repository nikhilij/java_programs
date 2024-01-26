// wap to convert the octal number to hexadecimal number
import java.util.Scanner;

public class OctalToHex {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the octal number: ");
        String num=scan.nextLine();
        int octal=Integer.parseInt(num,8);
        String hexaString=Integer.toHexString(octal);
        System.out.println("Hexadecimal value : "+hexaString);
    }
}
