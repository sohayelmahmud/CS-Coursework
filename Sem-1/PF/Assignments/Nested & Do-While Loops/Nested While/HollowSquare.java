import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        int length;
        Scanner size = new Scanner(System.in);

        System.out.println("        --- Hollow Square ---");
        System.out.print("Enter the length of pattern: ");
        length = size.nextInt();
        size.close();

        int row = 1;
        while (row <= length) {
            int j = 1;
            while (j <= length) {
                if (row == 1 || row == length)
                    System.out.print("*");
                else {
                    if (j == 1 || j == length)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            row++;
        }
    }
}
