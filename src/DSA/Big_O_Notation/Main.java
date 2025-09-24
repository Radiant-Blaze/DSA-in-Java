package DSA.Big_O_Notation;

public class Main
{
    public static void main(String[] args)
    {
        long n = 100000;
        long sum = 0;

        //For Linear Time

        System.out.println("Sum until : " + n + "\n");

        long startTime = System.nanoTime();

        for (int i = 0; i <= n; i++)
        {
            sum+=i;
        }

        long endTime = System.nanoTime();

        long totalTime = endTime - startTime;

        System.out.println("Sum : " + sum);
        System.out.println("O(n) \" Linear Time \" took   : " + totalTime + " ns \n");



        //For Constant Time

        startTime = System.nanoTime();

        sum = n * (n+1) / 2;

        endTime = System.nanoTime();

        totalTime = endTime - startTime;

        System.out.println("Sum : " + sum);
        System.out.println("O(1) \" Constant Time \" took : " + totalTime + " ns");

        /*
        * Here we will calculate the sum of natural numbers until n
        * by two things
        *
        * 1) For loop
        * 2) Formula
        *
        * see the loop took significantly more time when the value of n grows as it will need to work on each
        * value one by one hence it will take more time to calculate
        * in short it took more steps to calculate the answer hence more time taken ~n steps
        *
        * but the formula will take linear time, "instantaneous calculation" as the machine would need less
        * time due to calculation only needing one step to complete
        *
        * hence in real life we will use things which will reduce the burden of calculation on  our machines
        * as it will take more cost and time to calculate answers.
        * in short, it took fewer steps to calculate answers ~3 steps which is less than n steps
        * */
    }
}
