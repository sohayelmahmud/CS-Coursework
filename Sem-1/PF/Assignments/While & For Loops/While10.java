public class While10 {
    public static void main(String[] args) {
        int num1, num2, remainder;

        System.out.println("Enter first number: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Enter second number: ");
        num2 = Integer.parseInt(System.console().readLine());

        while (num2 > 0) {
            remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        System.out.println("GCD is: " + num1);
    }
}
