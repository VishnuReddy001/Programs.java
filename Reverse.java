import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int num= sc.nextInt();
        int Reverse = 0;
        while (num!=0) 
        {
            int remainder = num%10;
            Reverse=Reverse*10 + remainder;
            num = num/10;
        }
        System.out.println("the reverse number of " + num + " is = " +Reverse);
    }
}
