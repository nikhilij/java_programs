import java.util.*;

public class areaOfcircle {
    float PI=3.14f;
    public void area(float r){
        float area_c=PI*r*r;
        System.out.println(area_c);
    }
    public void perimeter(float r){
        float perimeter_c=2*PI*r;
        System.out.println(perimeter_c);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float radius=scan.nextFloat();
        scan.close();

        areaOfcircle Circle=new areaOfcircle();
        Circle.area(radius);
        Circle.perimeter(radius);


    }
}
