package DSA.Algorithms.Sorting_Algorithms.Basic_Algorithms.Insertion_Sort;

public class Main
{
    public static void main(String[] args)
    {
        // Insertion sort = after comparing elements to the left,
        //				shift elements to the right to make room to insert a value

        //				Quadratic time O(n^2)
        //				small data set = decent
        //				large data set = BAD

        //				Less steps than Bubble sort
        //				Best case is O(n) compared to Selection sort O(n^2)

        /*
         * In Insertion Sort we build a sorted portion of the array step by step.
         * Time complexity is O(n²) in the worst case, but it performs better than
         * Bubble or Selection Sort on nearly-sorted data.
         *
         * The idea:
         *   - We divide the array into a "sorted" part (on the left) and
         *     an "unsorted" part (on the right).
         *   - One by one, we take the first element from the unsorted part
         *     and insert it into the correct place in the sorted part.
         *
         * Steps:
         *   i)   Assume the first element (index 0) is already sorted.
         *   ii)  Take the next element (array[i]) as the "key".
         *   iii) Compare key with elements in the sorted portion (array[0 ... i-1]).
         *   iv)  Shift all elements greater than key one position to the right.
         *   v)   Insert key into the correct position.
         *   vi)  Repeat until the array is fully sorted.
         *
         * Example with [5, 3, 6, 1]:
         *   - Start: [5 | 3, 6, 1]   (5 is considered sorted)
         *   - Insert 3: [3, 5 | 6, 1]
         *   - Insert 6: [3, 5, 6 | 1]
         *   - Insert 1: [1, 3, 5, 6]
         *
         * These are the steps of the Insertion Sort Algorithm.
         */

        int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);

        for(int i : array) {
            System.out.print(i + " ");
        }

    }

    private static void insertionSort(int[] array)
    {

        for(int i = 1; i < array.length; i++)
        {
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
