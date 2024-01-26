import java.util.*;

public class Distance_q36 {
    public static final int radius = 6400; // Assuming radius of Earth in kilometers
    static Scanner scan = new Scanner(System.in);

    static double distance(double x1, double x2, double y1, double y2) {
        // Convert degrees to radians
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);

        // Compute the distance using the haversine formula
        double d = 2 * radius * Math.asin(Math.sqrt(Math.pow(Math.sin((x2 - x1) / 2), 2) +
                Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2)));
        return d;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first Latitude: ");
        double x1 = scan.nextDouble();
        System.out.println("Enter Second latitude: ");
        double x2 = scan.nextDouble();

        System.out.println("Enter first longitude: ");
        double y1 = scan.nextDouble();
        System.out.println("Enter second longitude: ");
        double y2 = scan.nextDouble();

        System.out.println("the distance between those points is: " + distance(x1, x2, y1, y2) + " kilometers");

    }
}
