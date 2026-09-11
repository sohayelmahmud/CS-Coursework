import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\t --- Decimal to Binary ---");
        System.out.print("Enter any decimal integer: ");
        int decimal = inp.nextInt();

        System.out.printf("%d in binary is: %s", decimal, decToBinary(decimal));
    }
    public static String decToBinary(int decimal) {
        String binary = "", binaryValue = "";
        byte remain = Byte.MIN_VALUE;
        while (decimal > 0) {
            remain = (byte) (decimal % 10);
            binary += Integer.toString(remain % 2);
            decimal /= 2;
        }
        for (int i = binary.length() - 1; i >= 0; i--) {
            binaryValue += binary.charAt(i);
        }
        return binaryValue;
    }
}