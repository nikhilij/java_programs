import  java.util.*;
//wap to convert the octal number to decimal number
public class OctalNumtToDec {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the octal number: ");
        String a=scan.nextLine();
        int dec =Integer.parseInt(a,8);
        System.out.println(dec);
    }
    
}
