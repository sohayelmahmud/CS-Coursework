import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String inputString = "";
        Scanner string = new Scanner(System.in);

        System.out.println("\t --- 'f' Occurance ---");
        System.out.print("Enter any String: ");
        inputString = string.nextLine().strip();
        string.close();

	boolean firstF = true;
	short firstFIndex = -1, lastFIndex = -1;

	for (short index = 0; index <= inputString.length() - 1; index++) {
		if (inputString.charAt(index) == 'f') {
			if (firstF) {
				firstFIndex = index;
				firstF = false;
			}
			lastFIndex = index;
		}
	}
	
	if (firstFIndex != lastFIndex) {
		System.out.printf("First and Last indexes of 'f' are: %c and %c respectively.",firstFIndex, lastFIndex);
	}
	else if (firstFIndex == lastFIndex) {
		System.out.println("Index of 'f' is: " + firstFIndex);
	}
	else {
		System.out.printf("There exist no 'f' in the given String");
        }
    }
}