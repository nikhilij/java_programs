// wap to print the ascii value of any character given by user

import java.util.Scanner;

public class Asciivalue {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch=scan.next().charAt(0);
        int ascii_value=(int)ch;
        System.out.println("ASCII value of "+ch+" is "+ascii_value);
        scan.close();
    }
    
}
