import java.util.Scanner;

public class StringReversePrint {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter any String: ");
    String string = inp.nextLine();
    int length = string.length() - 1;
    
    System.out.print("Reversed String is: ");
    do {
        System.out.print(string.charAt(length));
        length--;
      } while (length >= 0);
    }
}