public class Array {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8};
        int length = numbers.length;
        System.out.println("Length of array : " + length);
        numbers[4]=1;
        System.out.println("Updated index of 4: " + numbers[4]);
        System.out.println("Elements of array :");
        for(int i = 0; i < length ; i++)
        if (i == length - 1) 
        {
            System.out.print(numbers[i]);
        } 
        else 
        {
            System.out.print(numbers[i] + " , ");
        }
    }
}