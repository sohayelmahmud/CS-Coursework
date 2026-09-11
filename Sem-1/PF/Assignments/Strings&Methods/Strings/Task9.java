import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String inputString = "";
        Scanner string = new Scanner(System.in);

        System.out.println("\t --- 'h' Capitalization ---");
        System.out.print("Enter any String: ");
        inputString = string.nextLine().strip();
        string.close();

		byte firstH =  (byte) inputString.indexOf('h');
		byte lastH =  (byte) inputString.lastIndexOf('h');

		String newString = inputString.substring(0, firstH + 1) + inputString.substring(firstH + 1, lastH).replaceAll("h", "H") +
						 inputString.substring(lastH, inputString.length());

		System.out.print("Modified String is: " + newString);
    }
}