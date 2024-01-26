// there are two methods to do the same thing first i will go with traditional one 
// i will use inbuilt functions

import java.util.Scanner;

public class converttoBinarynum {

    void convert(int n){
        System.out.println("the binary number is : "+Integer.toBinaryString(n));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to convert: ");
        int n=scan.nextInt();
        int[] arr = new int[100];
        int temp=n;
        int i=0;
        if(n==0){
            System.out.println("0");
            return;
        }
        while(temp!=0){
            int rem=temp%2;
            arr[i++]=rem;
            temp/=2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        System.out.println();
        converttoBinarynum conv =new converttoBinarynum();
        conv.convert(n);
    }
}
