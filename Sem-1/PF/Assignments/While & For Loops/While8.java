public class While8 {
    public static void main(String[] args) {
        System.out.println("     *** Sum of series in a range ***");

        int low = Integer.parseInt(System.console().readLine("Enter lower limit: "));
        int up = Integer.parseInt(System.console().readLine("Enter higher limit: "));

        int sum = 0;
        int count = low;
        while (count <= up) {
            sum += count;
            count++;
        }

        System.out.printf("\nSum of series from %d to %d is %d", low, up, sum);
    }
}
