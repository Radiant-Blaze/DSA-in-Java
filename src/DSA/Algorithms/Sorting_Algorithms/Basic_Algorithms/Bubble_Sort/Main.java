package DSA.Algorithms.Sorting_Algorithms.Basic_Algorithms.Bubble_Sort;

public class Main
{
    public static void main(String[] args)
    {
        // bubble sort = pairs of adjacent elements are compared, and the elements
        //		            swapped if they are not in order.

        //				 Quadratic time O(n^2)
        //				 small data set = okay-ish
        //				 large data set = BAD (plz don't)

        /*
        * In Bubble Sort we comparee each element by their neighbour and swap them using this condition
        *
        * if n > ( n + 1 ) swap the values; which means that if left element is bigger
        * than right element we swap them
        *
        * it is very inefficient as our comparisons grow exponentially by the number of elemnts
        * time complexity -> n²
        * which means that
        * 10 elements -> 100 comparisons
        * 100 elements -> 1000 comparisons
        *
        * see how our workload increase exponentially hence bubble sort is
        * very inefficient and is not encouraged to be used
        * */

        int array[] = {2,5,8,13,5,51,9,1,6,8,6};
        int temp;

        System.out.println("Orignal array :");
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf(" " + array[i]);
        }
        System.out.println("\n");

        for (int pass = 0; pass < array.length - 1; pass++)
        {
            for (int i = 0; i < array.length - 1 - pass; i++)
            {
                if (array[i] > array[i + 1])
                {
                    temp = array[i];

                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array :");
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf(" " + array[i]);
        }
    }
}
