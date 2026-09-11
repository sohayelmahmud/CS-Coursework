public class AND_OR_NOT_XOR {
    public static void main(String[] args) {
        boolean first = true;
        boolean second = false;

        boolean result = (first || second) && !(first && second);
        System.out.println(result); // Output: true
    }
}

