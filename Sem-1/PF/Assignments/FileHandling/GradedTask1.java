import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GradedTask1 {
    public static void main(String[] args) {
        System.out.println("\t--- Integer Storing ---");
        // Scanner inp = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
                Scanner inp = new Scanner(System.in)) {
            System.out.println("Note: Enter '-1' to stop!");
            int num = 0;
            while (true) {
                System.out.print("Enter integer: ");
                try {
                    num = inp.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid Input" + "\n" + e.toString() );
                }
                finally {
                    inp.nextLine();
                }
                if (num == -1) {
                    break;
                }
                writer.write(num + "\n");
            }
        } catch (IOException e) {
            System.out.println("An exception Occured" + "\n" + e.toString());
        }
        System.out.println("Values successfully saved to file");
    }
}