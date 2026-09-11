import java.util.Scanner;

public class Smallest3{
    public static void main(String[] args) {
        float num1, num2, num3, smaller;
        Scanner number = new Scanner(System.in);

        System.out.print("Enter three numbers separated by space: ");
        num1 = number.nextFloat();
        num2 = number.nextFloat();
        num3 = number.nextFloat();

        if (num1 < num2 && num1 < num3){
            smaller = num1;
        }
        else if (num2 < num1 && num2 < num3) {
            smaller = num2;
        }
        else {
            smaller = num3;
        }
        System.out.println("Smallest of three is: " + smaller );
    }
}