import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String inputString = "";
        Scanner string = new Scanner(System.in);

        System.out.println("\t --- String Reduction on Basis of 'h' ---");
        System.out.print("Enter any String: ");
        inputString = string.nextLine().strip();
        string.close();

		byte firstH =  (byte) inputString.indexOf('h');
		byte lastH =  (byte) inputString.lastIndexOf('h');

		String newString = inputString.substring(0, firstH) +
						 inputString.substring(lastH + 1, inputString.length());

		System.out.print("Modified String is: " + newString);
    }
}