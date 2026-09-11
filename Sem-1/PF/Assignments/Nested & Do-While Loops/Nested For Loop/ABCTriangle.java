import java.util.Scanner;

public class ABCTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the length of Triangle: ");
        byte length = inp.nextByte();

        char c='A';
        for (int x = 1; x <= length; x++)
        {
            c='A';
            for (int y = 1 ; y <= x ; y++)
            {
                System.out.printf("%c",c);
                c++;
            }
            System.out.println();
        }
    }
}