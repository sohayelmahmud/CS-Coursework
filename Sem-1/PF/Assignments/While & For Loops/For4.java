import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        String inputString = "", modString = "";
        Scanner string = new Scanner(System.in);

        System.out.println("        --- Palindrome Checker ---");
        System.out.print("Enter any String: ");
        inputString = string.nextLine();
        string.close();

        // reverse the string
        for (int i = inputString.length() - 1 ; i >= 0 ; i--) {
            modString += inputString.charAt(i);
        }

        if (inputString.equalsIgnoreCase(modString)) {
            System.out.print("The String '" + inputString + "' is Palindrome.");
        }
        else{
            System.out.print("The String '" + inputString + "' is not Palindrome.");
        }
    }
}