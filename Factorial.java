import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorials of  the given number = ");
        int num = sc.nextInt();
        long Factorial=1;
        for(int i = 1; i <= num; i++)
        {
            Factorial=Factorial * i;
        }
        System.out.println("Factorial of "+num+" is = " + Factorial);
    }
}