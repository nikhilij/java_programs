public class Divisibility {
    public static void main(String[] args) {
        System.out.println("Divided by 3:");
        printDivisibleBy3();
        
        System.out.println("\nDivided by 5:");
        printDivisibleBy5();
        
        System.out.println("\nDivided by 3 & 5:");
        printDivisibleBy3And5();
    }

    private static void printDivisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    private static void printDivisibleBy5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    private static void printDivisibleBy3And5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}
