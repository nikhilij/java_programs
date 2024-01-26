import java.util.Scanner;

public class binaryToHex {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the binary to convert it to Hexadecimal: ");
        String b1=scan.nextLine();
        // lets convert the given string to binary format
        int a=Integer.parseInt(b1,2);
        String hex=Integer.toHexString(a);
        System.out.println("Hexadecimal value : "+hex);
    }
    
}
