import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float x,y,add,sub,mul,div;
        System.out.printf("\t\t--- Div, Mul, Add, Sub ---\n");
        System.out.printf("Note: To exit press '0'.");
        char ch;
        do {
            System.out.printf("\nEnter any Two Numbers:\nEnter 1st Number: ");
            x = inp.nextShort();

            System.out.print("Enter 2nd Number: ");
            y = inp.nextShort();

            System.out.printf("\nHere are Operations can can be Perfromed:\n*Choice* |\t*Operations*");
            System.out.printf("\n   1\t |\t  Addition");
            System.out.printf("\n   2\t |\t Subtraction");
            System.out.printf("\n   3\t |\tMultiplication");
            System.out.printf("\n   4\t |\t  Division");
            System.out.printf("\n=> Press any number key for desired choice: ");
            
            ch = inp.next().charAt(0);
            switch (ch) {
                case '1' -> System.out.printf("\n%.2f + %.2f = %.2f",x ,y ,x+y);
                case '2' -> System.out.printf("\n%.2f - %.2f = %.2f", x, y, x-y); 
                case '3' -> System.out.printf("\n%.2f x %.2f = %.2f",x,y,x*y);
                case '4' -> System.out.printf("\n%.2f / %.2f = %.2f",x,y, x/y);
                default -> System.out.printf("\nWrong Choice!");	
            }
        }
        while (ch != '0');
    }
}