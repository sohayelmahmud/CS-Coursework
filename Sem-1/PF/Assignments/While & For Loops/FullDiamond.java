public class FullDiamond {
    public static void main(String[] args) {
        int range = Integer.parseInt(System.console().readLine("Enter the length of Diamond: "));

        for (int i = 1; i <= (range + 1); i++) {
            
            // if half of the pattern is reached
            if (i > range/2) {
                // for spaces
                System.out.print(" ".repeat(i*2 - 1));

                // for initial stars after half
                System.out.print("*".repeat(((range+1) - i)*2 - 1));

                // for second stars after half
                System.out.println("*".repeat(((range+1) - i)*2 - 2));
            }

            // before half of pattern
            else {
                // for spaces
                System.out.print(" ".repeat(((range+1) - i)*2 - 1));

                // for initial stars after before half
                System.out.print("*".repeat(i*2 - 1));

                // for second stars before half
                System.out.println("*".repeat(i*2 - 2));
            }
        }
    }
}
