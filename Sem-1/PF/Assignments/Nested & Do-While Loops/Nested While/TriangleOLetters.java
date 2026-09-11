import java.util.Scanner;

public class TriangleOLetters {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\t --- Alphabet Triangle --- ");
        System.out.print("Enter the length of Triangle: ");
        byte length = inp.nextByte();

        char c = 'A';
        int x = 1;
        while (x <= length) {
            c = 'A';
            int y = 1;
            while (y <= x) {
                System.out.printf("%c", c);
                c++;
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
