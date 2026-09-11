public class XOR4 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;

        String result = (num1 == 1) ^ (num2 == 1) ? "One number equals 1" : "None or both equals 1";
        System.out.println(result); 
    }
}

