import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GradedTask3 {
    public static void main(String[] args) {
        System.out.println("\t--- Viewing Contents ---");
        int[] numsArray = new int[10];
        try (Scanner inp = new Scanner(new File("file.txt"))) {
            int i = 0, num;
            while (inp.hasNextInt()) {
                num = inp.nextInt();
                if (!isPrime(num)) {
                    numsArray[i] = num;
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("An exception Occured" + "\n" + e.toString());
        }
        writeContents(numsArray);
    }
    
    private static void writeContents(int[] numsArray) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("newFile.txt"))) {
            for (int num: numsArray) {
                if (num != 0) {
                    writer.write(num + "\n");;
                }
            }
        } 
        catch (IOException e) {
            System.out.println("An exception Occured" + "\n" + e.toString());    
        }
        System.out.println("Prime Numbers successfully removed.");

    }
    

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}