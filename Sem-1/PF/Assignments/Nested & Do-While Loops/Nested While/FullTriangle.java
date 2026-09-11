import java.util.Scanner;

public class FullTriangle {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);

        System.out.println("    --- Stars Triangular Pattern ---");
        System.out.print("Enter the length of pattern: ");
        int length = size.nextInt();
        size.close();

        int i = 1;
        while (i <= length) {
            int j = i;
            while (j <= length - 1) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= (2 * i) - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
