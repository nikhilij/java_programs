// this program will take the path of the specifed file as input from the user and print its size

import java.io.File;
import java.util.Scanner;

public class SizeOfFile2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the file path
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        // Create a File object using the specified file path
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            // Get the size of the file in bytes
            long fileSizeInBytes = file.length();

            // Print the size of the file
            System.out.println("Size of the file '" + filePath + "': " + fileSizeInBytes + " bytes");
        } else {
            System.out.println("File does not exist at the specified path.");
        }

        // Close the scanner
        scanner.close();
    }
}
