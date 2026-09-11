import java.util.Scanner;

public class IncreasingNumTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\t --- IncreasingNumTriangle --");
        System.out.print("Enter the length of Triangle: ");
        byte length = inp.nextByte();

        byte n = 1;
        System.out.printf("%d\n", n);

        int x = 1;
        while (x <= length) {
            System.out.printf("%d ", n);

            int y = 1;
            while (y <= x) {
                n++;
                System.out.printf("%d ", n);
                y++;
            }

            System.out.printf("\n");
            x++;
        }
    }
}
