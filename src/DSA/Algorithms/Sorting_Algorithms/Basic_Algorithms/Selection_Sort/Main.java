package DSA.Algorithms.Sorting_Algorithms.Basic_Algorithms.Selection_Sort;

public class Main
{
    public static void main(String[] args)
    {
        // selection sort = search through an array and keep track of the minimum value during
        //			         each iteration. At the end of each iteration, we swap values.

        //				 Quadratic time O(n^2)
        //				 small data set = okay
        //				 large data set = BAD

        /*
        * Yo ok so in selection sort we sort items very differently than Bubble Sort
        * But our Time complexity is same that is O( n² )
        *
        * we first look for our most little value then replace that with the index value
        *
        * The steps are:
        *
        *   i)      Start at the index " i " of the array   -> in first step i = 0
        *   ii)     look for the most minimum value in the array and store it in min
        *   iii)    replace the min value by the array[i] value and vise versa
        *   iv)     i++
        *   v)      go to step i
        *
        * these are the steps we take to sort the array in Selection Sort Algorithm
        * */


        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for(int i : array)
        {
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] array)
    {

        for(int i = 0; i < array.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[min] > array[j])
                {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }
}
