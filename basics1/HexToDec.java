// write a java program to convert hexa decimal value to the decimal value
import java.util.*;

public class HexToDec{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the hexadecimal value : ");
        String num=scan.nextLine();
        int hex=Integer.parseInt(num,16);
        String binary=Integer.toBinaryString(hex);
        int dec=Integer.parseInt(binary,2);
        System.out.println("Decimal value: "+dec);
    }
}