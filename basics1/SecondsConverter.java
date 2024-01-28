import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input seconds
        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();
        scanner.close();

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // Display the result
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
