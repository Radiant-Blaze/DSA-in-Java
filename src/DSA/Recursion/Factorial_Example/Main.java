package DSA.Recursion.Factorial_Example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Factorial Calculator\n");

        System.out.print("Enter the number: ");
        int value = scanner.nextInt();

        long result = Factorial_Calculator(value);

        System.out.println( value +  "! " + " = " + result);

        scanner.close();
    }

    private static long Factorial_Calculator(int value) {
        if (value < 0)                      throw new IllegalArgumentException("Enter +ve integer digit");
        if (value == 0 || value == 1)       return 1;

        return value * Factorial_Calculator(value - 1);
    }

    /*
    * 5 -->     5 -> 5*4 -> 5*4*3 -> 5*4*3*2 -> 5*4*3*2*1   //as base case reached value == 1 we exit
    * */

}
