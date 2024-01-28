// write a program to convert a string to an integer

import java.util.Scanner;

public class StringtoInt {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input a string : ");
        String num=scan.next();
        scan.close();
        int n=Integer.parseInt(num);
        System.out.println("The integer value is : "+n);
    }
}
