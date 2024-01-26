// wap to convert the binary to octal number
import java.util.Scanner;

public class BinarytoOctal {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the binary number to convert it to octal : ");
        String b1=scan.nextLine();
        int a=Integer.parseInt(b1,2);
        String octalString=Integer.toOctalString(a);
        System.out.println("Octal value is : "+octalString);       
    }
}
