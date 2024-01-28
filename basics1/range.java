import java.util.Scanner;

public class range {
    static int evaluate(int a,int b, int n){
        int count =0;
        for(int i=a;i<=b;i++){
            if(i%n==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter x: ");
        int x=scan.nextInt();
        System.out.println("Enter y: ");
        int y=scan.nextInt();
        System.out.println("Enter the value for divisibility: ");
        int n=scan.nextInt();
        scan.close();

        System.out.print(evaluate(x, y, n));
    }
}
