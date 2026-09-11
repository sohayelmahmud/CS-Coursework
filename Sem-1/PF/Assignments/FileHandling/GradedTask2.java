import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class GradedTask2 {
    public static void main(String[] args) {
        System.out.println("\t--- Viewing Contents ---");
        int[] numsArray = new int[10];
        try (Scanner inp = new Scanner(new File("file.txt"))) {
            int i = 0;
            while (inp.hasNextInt()) {
                numsArray[i] = inp.nextInt();
                i++;
            }
            bubbleSort(numsArray);
        } catch (IOException e) {
            System.out.println("An exception Occured" + "\n" + e.toString());
        }
        for (int num: numsArray) {
            System.out.println(num);
        }
    }

    private static void bubbleSort(int[] numsArray) {
        int temp = 0;
        for (int run = numsArray.length - 1; run >= 1; run--) {
            for (int i = 0; i < run; i++) {
                if (numsArray[i] > numsArray[i + 1]) {
                    temp = numsArray[i + 1];
                    numsArray[i + 1] = numsArray[i];
                    numsArray[i] = temp;
                }
            }
        }
    }
}