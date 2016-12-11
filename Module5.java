import java.util.*;


public class Module5
{
    public static int recursiveSum(int[] array, int index)
    {
        if (index == array.length)
        {
            return 0;
        } else
        {
            return array[index] + recursiveSum(array, index + 1);
        }
    }



    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter a number");
            numbers[i] = keyboard.nextInt();

        }



        System.out.println("The answer using recursion is: " + recursiveSum(numbers, 0));
    }
}


