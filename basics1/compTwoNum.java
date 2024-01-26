import java.util.Scanner;

public class compTwoNum {

    void compare(int a,int b){
        if(a!=b){
            System.out.println(a+" != "+b);
        }
        if(a<b){
            System.out.println(a+" < "+b);
        }
        if(a<=b){
            System.out.println(a+" <= "+b);
        }
        if(a>b){
            System.out.println(a+" > "+b);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter two numbers : ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        scan.close();

        compTwoNum c =new compTwoNum();
        c.compare(a, b);
    }
}
