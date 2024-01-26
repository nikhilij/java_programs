// import java.util.HexFormat;
import java.util.Scanner;

public class convertToHEx {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number to convert to hexadecimal: ");
        int a=scan.nextInt();
        scan.close();
        String hexamString=Integer.toHexString(a);
        System.out.println(hexamString);

    }
}
