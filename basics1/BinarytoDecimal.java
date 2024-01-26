import java.util.Scanner;

public class BinarytoDecimal {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the binary number to convert to decimal: ");
        String b1=scan.nextLine();
        int decimal =Integer.parseInt(b1,2);
        System.out.println("Decimal number: "+decimal);
    }
}
