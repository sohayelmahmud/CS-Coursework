import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\t --- Stop-Watch ---");;
        System.out.print("Enter minutes: ");
        short min = inp.nextShort();

        System.out.print("Enter Seconds: ");
        short sec = inp.nextShort();
    
        System.out.print("\nCount-down starts now:\n");
        for (int ss=sec; ss>=0; ss--) {
            System.out.printf("%02d : %02d\n",min,ss);
        }
    
        for (int mm=min-1; mm>=0; mm--) {
            for (int ss=59; ss>=0; ss--) {
                System.out.printf("%02d : %02d\n",mm,ss);
            }
        }
    }
}
