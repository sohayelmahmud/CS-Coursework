public class While9 {
    public static void main(String[] args) {
        short num = Short.parseShort(System.console().readLine("Enter any number: "));

        short count = 1;
        System.out.println("        Reverse Table of " + num + ":");

        while (count <= 10) {
            int product = count * num;
            System.out.println(num + " x " + count + " = " + product);
            count++;
    } 
  }
}
