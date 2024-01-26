import java.util.*;
public class Mulitplicationtable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to print its table : ");
        int a=scan.nextInt();
        scan.close();
        for(int i =1;i<11;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
    }
}
