import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
public class TryCatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number= ");
            int num1 = sc.nextInt();
            System.out.println("Enter another number= ");
            int num2 = sc.nextInt();
            int result = num1/num2;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: Division by Zero is not allowed.");
        }catch(java.util.InputMismatchException e){
            System.out.println("ERROR: Please enter valid interger as input.");
        }catch(Exception e){
            System.out.println("ERROR: An error occured: " + e.getMessage());
        }finally{
            System.out.println("Exception Completed.");
            sc.close();
        }
    }
}