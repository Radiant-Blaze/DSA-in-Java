package DSA.Algorithms.Search_Algorithms.Beginner.Binary_Search.Pre_Defined;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {

        /*
        * hey just run the program and you will see the results
        *
        * just here we see that
        * small     data sets take more time
        * medium    data sets take almost little time
        * large     data sets take little time to find value
        *
        * it operates with O( log n ) time complexity which is a logarithmic curve
        * which means anything small will take more time to find than medium or large value
        *
        * how does this binary search work?
        *
        * it works in these four steps:
        *
        * 1) Start at the middle of the array
        * 2) Check if the values are less/more than desired target
        * 3) then we
        *       i)      if value is equal to target,  return the value              -> index[i] = target
        *       ii)     if value is less then target, eliminate the greater values  -> index[i] < target
        *       iii)    if value is more then target, eliminate the lesser  values  -> index[i] > target
        * 4) then we
        *       i)      stop the binary search if condition " i " is fulfilled
        *       ii)     repeat step 1
        * */

        int target_Sm   = 42;
        int target_Md   = 2000;
        int target_Lg  = 92964585;
        int array[] = new int[10000000]; // 10 million instead of 999 million


        for(int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }

        long start = System.nanoTime();
        int index = Arrays.binarySearch(array , target_Sm);
        long end = System.nanoTime();

        long total_Time = end - start;

        System.out.println("Time taken to find " + target_Sm + " : " + total_Time);




        start = System.nanoTime();
        index = Arrays.binarySearch(array , target_Md);
        end = System.nanoTime();

        total_Time = end - start;

        System.out.println("Time taken to find " + target_Md + " : " + total_Time);




        start = System.nanoTime();
        index = Arrays.binarySearch(array , target_Lg);
        end = System.nanoTime();

        total_Time = end - start;

        System.out.println("Time taken to find " + target_Lg + " : " + total_Time);

    }
}
