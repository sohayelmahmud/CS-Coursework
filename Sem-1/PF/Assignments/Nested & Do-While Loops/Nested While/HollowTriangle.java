import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        int length;
        Scanner size = new Scanner(System.in);

        System.out.println("        --- Stars Hollow Triangle ---");
        System.out.print("Enter the length of Triangle: ");
        length = size.nextInt();
        size.close();

        int row = 1;
        while (row <= length) {

            int initSpace = row;
            while (initSpace <= length - 1) {
                System.out.print(" ");
                initSpace++;
            }

            int star = 1;
            while (star <= (2 * row) - 1) {
                if (row == length)
                    System.out.print("*");
                else {
                    if (star == 1 || star == (2 * row) - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                star++;
            }

            System.out.println();
            row++;
        }
    }
}
