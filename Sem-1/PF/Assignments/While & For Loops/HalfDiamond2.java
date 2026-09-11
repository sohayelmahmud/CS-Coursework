public class HalfDiamond2 {
    public static void main(String[] args) {
        int range = Integer.parseInt(System.console().readLine("Enter the length of Half-Diamond: "));

        for (int i = 1; i <= (range + 1); i++) {
            
            // if half of the pattern is reached
            if (i > range/2) {
                // for spaces
                System.out.print(" ".repeat(i*2 - 1));

                // for stars after half
                System.out.println("*".repeat(((range+1) - i)*2 - 1));
            }

            // before half of pattern
            else {
                // for spaces
                System.out.print(" ".repeat(((range+1) - i)*2 - 1));

                // for stars after before half
                System.out.println("*".repeat(i*2 - 1));
            }
        }
    }
}
