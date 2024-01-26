import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first binary number: ");
        String binary1=scan.next();
        System.out.println("Enter the second binary number: ");
        String binary2=scan.next();
        int a=Integer.parseInt(binary1,2);
        int b=Integer.parseInt(binary2,2);
        int c=a*b;
        System.out.println("Multiplication two binary numbers is "+Integer.toBinaryString(c));
    }
}
