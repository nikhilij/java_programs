// wap to find the hexagon area

import java.util.Scanner;

public class hexagonarea {
    public static double hexagonArea(double len){
        return (6*(len*len))/(4*Math.tan(Math.PI/6));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the side: ");
        double len=scan.nextFloat();
        scan.close();
        System.out.println("the area of the hexagon is : "+ hexagonArea(len));
    }
}
