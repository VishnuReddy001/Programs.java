import java.util.Scanner;
class Secondhighest {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements = ");
int N = sc.nextInt();
if (N <= 1)
{ 
    System.out.println("Enter atleast 2 elements!!");
}
int[] number =  new int[N];
for(int i = 1 ;i < N ; i++ )
{
    System.out.println("Enter numbers ");
number[i] = sc.nextInt();
}
int firstMax = Integer.MIN_VALUE;
int secondMax= Integer.MIN_VALUE;
for(int numbers : number)
{if(numbers > firstMax)
    {
    secondMax = firstMax;firstMax = numbers;
}
else if(numbers > secondMax && numbers != firstMax)
{
    secondMax = numbers;
}
}
if (secondMax == Integer.MIN_VALUE) 
{
    System.out.println("There is no second highest number.");
} else {
    System.out.println("The second highest number is = " + secondMax);
}
}
}