import java.util.Scanner;

public class areaOfpolygon {

    static double area(int n,int len){
        return (n*len*len)/(4*Math.tan(Math.PI/n));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of sides on the polygon : ");
        int n=scan.nextInt();
        System.out.println("Enter the length of one of the sides : ");
        int len=scan.nextInt();
        scan.close();
        
        System.out.println("Area of the polygon : "+area(n, len));

    }
}
