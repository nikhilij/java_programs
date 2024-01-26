import java.util.Scanner;

public class sumOfdigits {
    static Scanner scan =new Scanner(System.in);
    int sum(int n){

        int temp,sum=0,rem;
        temp=n;
        while(temp!=0){
            rem=temp%10;
            sum+=rem;
            temp/=10;
        } 
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to find the sum of its digits: ");
        int n=scan.nextInt();
        scan.close();
        sumOfdigits sum=new sumOfdigits();
        System.out.println(sum.sum(n));
    }
}
