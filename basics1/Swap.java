import java.util.Scanner;

public class Swap {
    void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scan.nextInt();
        System.out.println("Enter b: ");
        int b=scan.nextInt();
        scan.close();
        Swap sw=new Swap();
        sw.swap(a, b);

    }
}
