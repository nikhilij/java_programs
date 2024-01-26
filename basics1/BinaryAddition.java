import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first Binary number: ");
        String binary1=scan.next();
        System.out.println("Enter second Binary number: ");
        String binary2=scan.next();
        scan.close();
        int a=Integer.parseInt(binary1,2);
        int b=Integer.parseInt(binary2,2);
        int sum=a+b;
        System.out.println("The addition of two binary numbers is "+Integer.toBinaryString(sum));

    }
}
