import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter size of Binary Digit Triangle: ");
        byte length = inp.nextByte();

        int n=1;
        for (int i = 1; i <= length; ++i)
        {
            for (int j=1;j<=i;)
            {
                n--;
                System.out.printf("%d ",n);
                n++;
                System.out.printf("%d ",n);
                j++;
            }
            System.out.println();
        }
    }
}