public class Star {
    public static void main(String[] args) {
        int size = Integer.parseInt(System.console().readLine("Enter the size of Star: "));

        int j = size/2;
        int k = 1;
        size = size % 2 != 0 ? size - 1 : size;

        for (int i = 0 ; i <= size; i++) {
            if (i == size / 2) {
                
                System.out.print("* ".repeat(size - (size/2) + 2));
                System.out.println();
            }
            if (i < size/2) {
                System.out.print(" ".repeat(i));
                System.out.print("*" + " ".repeat(j) + "*" + " ".repeat(j) + "*");
                System.out.println();
                j--;
            }
            if (i >= size/2) {
                System.out.print(" ".repeat(size - i - 1));
                System.out.print("*" + " ".repeat(k) + "*" + " ".repeat(k) + "*");
                System.out.println();
                k++;
            }
        }
    }
}
