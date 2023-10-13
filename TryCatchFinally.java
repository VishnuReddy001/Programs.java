import java.io.IOException;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int result = divide(10,0);
            System.out.println("Result" + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by 0 is not allowed");
        }
    }
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return numerator / denominator;
    }

    public static void readFile(String fileName) throws IOException {
        throw new IOException("File not found: " + fileName);
    }
}