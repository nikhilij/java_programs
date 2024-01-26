// wap to take three inputs from the user and find their average

import java.util.Scanner;

public class Average{
    static Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        float a,b,c;
        System.out.println("Enter first number: ");
        a=scan.nextFloat();
        System.out.println("Enter the second number: ");
        b=scan.nextFloat();
        System.out.println("Enter third number: ");
        c=scan.nextFloat();
        
        float average=(a+b+c)/3;
        System.out.println(average);
    }
}