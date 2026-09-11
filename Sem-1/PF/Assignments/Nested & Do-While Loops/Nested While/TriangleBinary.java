import java.util.Scanner;
public class TriangleBinary {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("\t --- Binary Digit Triangle ---\n");
        System.out.print("Enter size of Binary Digit Triangle: ");
        byte length = inp.nextByte();

        int n = 1;
        int i = 1;
        while (i <= length) {
            int j = 1;
            while (j <= i) {
                n--;
                System.out.printf("%d ", n);
                n++;
                System.out.printf("%d ", n);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}