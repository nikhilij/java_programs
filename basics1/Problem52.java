import java.util.Scanner;

public class Problem52 {
    static void check(int n1,int n2,int n3){
        if((n1+n2)==n3 || (n3+n2)==n1 || (n1+n3)==n2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the first number : ");
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        System.out.println("Enter the second number ");
        int n2=scan.nextInt();
        System.out.println("Enter the third number : ");
        int n3=scan.nextInt();

        check(n1, n2, n3);
    }
}
