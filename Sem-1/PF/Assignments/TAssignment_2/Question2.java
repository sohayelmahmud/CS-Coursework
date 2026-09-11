import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\t --- Substring Checker ---");
        System.out.print("Enter first string: ");
        String str1 = inp.nextLine();

        System.out.print("Enter second string: ");
        String str2 = inp.nextLine();

        if (str1.contains(str2)) {
            System.out.printf("\'%s\' is a substring of \'%s\'", str2, str1);
        } else {
            System.out.printf("\'%s\' is not a substring of \'%s\'", str2, str1);
        }
    }
}