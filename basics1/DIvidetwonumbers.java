import java.util.*;

public class DIvidetwonumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to divide: ");
        int a=scan.nextInt();
        System.out.println("Enter the divisor");
        int b=scan.nextInt();
        int c=a/b;
        System.out.println(c);
    }
}
