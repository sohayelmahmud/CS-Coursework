import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner limit = new Scanner(System.in);

        System.out.println("         *** Even numbers print ***");

        System.out.print("Enter lower limit: ");
        int low = limit.nextInt();

        System.out.print("Enter higher limit: ");
        int up = limit.nextInt();

        System.out.printf("Even numbers from %d to %d (inclusive) are:%n", low, up);

        int count = low;

        while (count <= up) {
            if (count % 2 == 0) {
                System.out.printf("  %d%n", count);
            }
            count++;
        }

        limit.close();
    }
}
