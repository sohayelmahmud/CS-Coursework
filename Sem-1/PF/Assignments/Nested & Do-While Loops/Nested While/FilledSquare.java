import java.util.Scanner;
public class FilledSquare {
    public static void main(String[] args) {
        int length;
        Scanner size = new Scanner(System.in);

        System.out.println("        --- Filled Square ---");
        System.out.print("Enter the length of pattern: ");
        length = size.nextInt();
        size.close();

        int i = 1;
        while (i <= length) {
            int j = 1;
            while (j <= length) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}