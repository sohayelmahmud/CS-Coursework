import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        int length;
        Scanner size = new Scanner(System.in);

        System.out.println("        --- Stars Hollow Triangle ---");
        System.out.print("Enter the length of Triangle: ");
        length = size.nextInt();
        size.close();


        // outer loop for rows (size)
        for (int row = 1; row <= length ; row++) {

            // for spaces
            for (int initSpace = row ; initSpace <= length - 1 ; initSpace++) {
                System.out.print(" ");
            }

            // for stars
            for (int star = 1 ; star <= (2 * row) - 1 ; star++) {  // 2 * 1 - 1 = 1 ; 2 * 2 - 1 = 3
                if (row == length)
                    System.out.print("*");
                else {
                    if (star == 1 || star == 2 * row - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();    // next line
        }
    }
}