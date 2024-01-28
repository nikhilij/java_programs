import java.util.Scanner;

public class oddeven {
    static void oddoreven(int n){
        if(n%2==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number to check : ");
        int n=scan.nextInt();
        scan.close();
        oddoreven(n);
    }
}
