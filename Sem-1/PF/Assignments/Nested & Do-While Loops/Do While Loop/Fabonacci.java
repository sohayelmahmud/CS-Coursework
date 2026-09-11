import java.util.Scanner;

public class Fabonacci {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            
            System.out.print("\t --- Fabonacci Sequence ---\n");
            System.out.print("Enter the term no. to which sequence required: ");
            int range = inp.nextInt();
            int first = 0, second = 1, nextNum;
    
            System.out.print(first + " " + second + " ");
            short count = 2;

            do {
                nextNum = first + second;
                System.out.print(nextNum + " ");
    
                first = second;
                second = nextNum;
                count++;
            } while (count <= range);
        }
    }