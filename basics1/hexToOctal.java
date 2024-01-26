import java.util.Scanner;

public class hexToOctal {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Hexadecimal value : ");
        String hex=scan.nextLine();
        int decimal=Integer.parseInt(hex,16);
        String octal=Integer.toOctalString(decimal);
        System.out.println("Octal value : "+octal);
    }
    
}
