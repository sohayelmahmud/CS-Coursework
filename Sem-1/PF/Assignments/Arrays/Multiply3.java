import java.util.Arrays;

public class Multiply3 {
    public static void main(String[] args) {
        int arrayLength = 10;
        int[] array = new int[arrayLength];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = (int) (Math.random() * 100);
            array[i] = num;
        }
        System.out.println("Array before multiplying by 3: " + Arrays.toString(array) + "\n");

        modify(array);
        System.out.println("Elements of array after multiplying by 3:");
        for (int item: array) {
            System.out.print(item + ", ");
        }
    }

    private static void modify(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 3;
        }
    }
}
