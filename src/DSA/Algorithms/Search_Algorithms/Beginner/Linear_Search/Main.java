package DSA.Algorithms.Search_Algorithms.Beginner.Linear_Search;

public class Main
{
    public static void main(String[] args)
    {
        /*
        * Yo lets go today we will learn about linear search algorithm
        *
        * runtime complexity: O(n) -> Linear time
        *
        * advantages:
        *
        *               don't need to be sorted unlike other algorithms
        *
        * lets say that we have array of n elements and need to find x value in it
        * 1) If the array is unsorted no matter what algorithm we use we will have linear time complexity O(n)
        *    that's why we need the collection to be sorted for other elements to be found
        *
        * 2) If the array is sorted we can have other algorithms to run with less time complexity
        *
        * but in the case or Linear Search we go through each element in the run hence the data doesn't
        * need to be sorted unlike other algorithms
        *
        *               Fast searches for small and medium data sets
        *
        * well unlike other algorithms we can run through them in an instant hence less CPU load ~ haa
        * some algorithm are CPU intensive like linear is straight forward
        *
        *               Useful for datasets with no random access -> Linked List
        *
        * well lets see the example of linked list you know that we can't go to a certain index and need
        * to iterate through each element hence Linear Search Algorithm is what we use there
        *
        * Disadvantages:
        *
        *           Time consuming for Large data sets
        *
        * like it is idiotic to go through a million elements if we can do it in O(1) time.
        *
        *
        * */


        // linear search = Iterate through a collection one element at a time

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 5);

        if(index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else
        {
            System.out.println("Element not found");
        }

    }

    private static int linearSearch(int[] array, int value)
    {

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == value)
            {
                return i;
            }
        }

        return -1;
    }

}