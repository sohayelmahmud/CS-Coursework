import java.util.Scanner;

public class IncreasingNumTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the length of Triangle: ");
        byte length = inp.nextByte();

        byte n = 1;
        System.out.printf("%d\n",n);
        for (int x=1 ; x <= length; ++x)
        {
            System.out.printf("%d ",n);
            for (int y = 1; y <= x; y++)
            {
                n++;
                System.out.printf("%d ",n);
            }
            System.out.printf("\n");
        }
    }
}
