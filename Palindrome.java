import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number = ");
        long num = sc.nextLong();
        long Org_num = num;
        long rev = 0;
        while (num != 0) 
        {
            rev = rev*10 + num%10;
            num = num/10;  
        }
        if (Org_num==rev) {
            System.out.println(Org_num + " is a palindrome number!!!");
        } else {
            System.out.println(Org_num+ " is not a palindrome number");            
        }
    }
}