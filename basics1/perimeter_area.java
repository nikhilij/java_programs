// wap to program to print the area and perimeter of a rectangle
import java.util.*;
public class perimeter_area {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        float width,height;
        System.out.print("Enter width : ");
        width=scan.nextFloat();
        System.out.print("Enter height: ");
        height=scan.nextFloat();

        float area=width*height;
        float perimeter=2*(width+height);

        System.out.println("The perimeter of the rectangle is : "+perimeter);
        System.out.println("The area of the rectangel is : "+area);

        
    }
    
}
