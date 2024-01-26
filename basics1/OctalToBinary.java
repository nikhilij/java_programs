// wap to convert it to octal to binary number
import java.util.*;
public class OctalToBinary {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the octal number to convert it binary : ");    
        String num=scan.nextLine();
        int octal=Integer.parseInt(num,8);
        String binary=Integer.toBinaryString(octal);
        System.out.println("the binary value is : "+binary);
}
}

