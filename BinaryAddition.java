/// dekho isko karne ke liye java mein inbuilt function hai basically tumhe ye soch ke chlnan hai  ki tum phle 
// diye hue binary numbers ko kaise input logi to wo string mein input lena hoga den tumhe usse binary mein karna hoga
// uske liye tumko parseint kar ke ek method hai java mein integer class ka thik hai to usme tum wo string and corresponding 2 base ko indicate kar rha hai
// to phir usko decimal1 and decimal2 mein rkh kar addition kara do and then again us sum ko phir binary mein change karne ke liye toBinaryString ka use karogii......and then display kara dena


import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int sumDecimal = decimal1 + decimal2;
        String sumBinary = Integer.toBinaryString(sumDecimal);

        System.out.println("Sum in binary: " + sumBinary);
    }
}
