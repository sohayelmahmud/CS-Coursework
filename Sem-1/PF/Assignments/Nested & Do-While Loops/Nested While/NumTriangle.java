import java.util.Scanner;

public class NumTriangle {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);

        System.out.println("    --- Numeric Triangular Pattern ---");
        System.out.print("Enter the length of pattern: ");
        int length = size.nextInt();
        size.close();

        int i = 1;
        while (i <= length) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
