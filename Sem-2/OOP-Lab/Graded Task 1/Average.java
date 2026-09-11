import java.util.Scanner;

public class Average {
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers you want to enter? ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers.");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        double avrg = calculateAverage(arr);

        System.out.println("Calculated average: " + avrg);

        scanner.close();

    }

}
