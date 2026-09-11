import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String inputString = "";
	boolean isPalindrome = true;
        Scanner string = new Scanner(System.in);

        System.out.println("        --- Palindrome Checker ---");
        System.out.print("Enter any String: ");
        inputString = string.nextLine();
        string.close();

	byte end = (byte)(inputString.length() - 1);

	for (byte start = 0; start <= inputString.length() / 2; start++) {
		if (inputString.charAt(start) != inputString.charAt(end)){
			isPalindrome = false;
			break;
		}
		end--;
	}

        if (isPalindrome) {
            System.out.print("The String '" + inputString + "' is Palindrome.");
        }
        else {
            System.out.print("The String '" + inputString + "' is not Palindrome.");
        }
    }
}