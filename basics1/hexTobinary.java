import java.util.Scanner;

public class hexTobinary {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the hexadecimal value : ");
        String num=scan.nextLine();
        int Hex=Integer.parseInt(num,16);
        String binary=Integer.toBinaryString(Hex);
        System.out.println("Decimal value : "+ binary);
    }
}
