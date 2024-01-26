import java.util.*;
public class Question6{
    public static void main(String[] args) {
        System.out.println("Enter the two numbers to print it mul,add,sub,division,modulo,etc: ");
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(a+ " + "+ b +"= "+ (a+b));
        System.out.println(a+ " / "+ b +"= "+ (a/b));
        System.out.println(a+ " * "+ b +"= "+ (a*b));
        System.out.println(a+ " - "+ b +"= "+ (a-b));
        System.out.println(a+ " % "+ b +"= "+ (a%b));
    }
}