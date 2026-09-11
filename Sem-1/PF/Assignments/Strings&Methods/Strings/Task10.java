import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String inputString = "";
        Scanner string = new Scanner(System.in);

        System.out.println("\t --- String Properties ---");
        System.out.print("Enter any String: ");
        inputString = string.nextLine().strip();
        string.close();

        // storing chars at even indexes
        String evenIndicesChars = "";
        for (short index = 0; index < inputString.length(); index += 2) {
            evenIndicesChars += inputString.charAt(index);
        }

        // storing odd indexes' chars
        String oddIndicesChars = "";
        for (short index = 1; index < inputString.length(); index += 2){
            oddIndicesChars += inputString.charAt(index);
        }

        // reverse string
        String reversedString = "";
        for (short index = (short)(inputString.length() - 1); index >= 0; index--) {
            reversedString += inputString.charAt(index);
        }
        // every second character reversed 
        String secondCharReversed = "";
        for (short index = (short) (inputString.length() - 2); index >= 0; index -=2) {
            secondCharReversed += inputString.charAt(index);
        }

        System.out.printf("Third Character: %c%n", inputString.charAt(2));
        System.out.printf("Second to Last Character: %c%n",
                inputString.charAt(inputString.length() - 2));
        System.out.printf("First Five Characters: %s%n",
                inputString.substring(0, 5));
        System.out.printf("All Characters except last two: %s%n",
                         inputString.substring(0, inputString.length() - 2)); 
        System.out.printf("Characters at even indexes: %s%n", evenIndicesChars); 
        System.out.printf("Characters at odd indexes: %s%n", oddIndicesChars); 
        System.out.printf("Characters in reverse order: %s%n", reversedString); 
        System.out.printf("Every Second Character in reverse order: %s%n", secondCharReversed); 
        System.out.printf("Length of String: %d", inputString.length());


    }
}