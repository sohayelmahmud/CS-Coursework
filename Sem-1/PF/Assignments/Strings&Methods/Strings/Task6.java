import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String inputString = "";
        Scanner string = new Scanner(System.in);

        System.out.println("\t --- String Swappig ---");
        System.out.print("Enter any String (must consist of two words only, separated by space): ");
        inputString = string.nextLine().strip();
        string.close();

	byte spaceIndex = (byte) inputString.indexOf(" ");
	String newString = inputString.substring(spaceIndex + 1, inputString.length()) + " " + inputString.substring(0, spaceIndex);

        System.out.print("Swapped Words' String is: " + newString);
        
       
    }
}