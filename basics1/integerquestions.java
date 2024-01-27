import java.util.*;
//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
public class integerquestions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number/ an integer : ");
        int n=scan.nextInt();
        int sum=n+n*11+n*111;
        System.out.printf("%d + %d%d  + %d%d%d : ", n, n, n, n, n, n);
        System.out.println(sum);
        scan.close();
    }
    
}
