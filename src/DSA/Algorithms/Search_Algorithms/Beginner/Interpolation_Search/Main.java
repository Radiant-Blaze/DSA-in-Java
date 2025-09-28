package DSA.Algorithms.Search_Algorithms.Beginner.Interpolation_Search;

public class Main
{
    public static void main(String args[])
    {

        //interpolation search =  improvement over binary search best used for "uniformly" distributed data
        //					     "guesses" where a value might be based on calculated probe results
        //				             if probe is incorrect, search area is narrowed, and a new probe is calculated

        //						  average case: O(log(log(n)))
        //						  worst case: O(n) [values increase exponentially]

        /*
        * it has the same steps as binary search onyl the first step is changed that is instead of
        * stating at the middle we start at the position calculated by probe formula
        *
        * it works in these four steps:
        *
        * 1) Use the probe formula to go to the index
        * 2) Check if the values are less/more than desired target
        * 3) then we
        *       i)      if value is equal to target,  return the value              -> index[i] = target
        *       ii)     if value is less than target, eliminate the greater values  -> index[i] < target
        *       iii)    if value is more than target, eliminate the lesser  values  -> index[i] > target
        * 4) then we
        *       i)      stop the binary search if condition " i " is fulfilled
        *       ii)     repeat step 1
        *
        * */

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int index = interpolationSearch(array, 8);

        if(index != -1)         System.out.println("Element found at index: "+ index);
        else                    System.out.println("Element not found");
    }

    private static int interpolationSearch(int[] array, int value)
    {

        int high = array.length - 1;
        int low = 0;

        /*
         * This condition ensures we don’t go out of array bounds.
         * It checks that the target value lies between the current
         * lowest element (array[low]) and highest element (array[high]).
         *
         * Why is array[low] the lowest? Because the array is sorted.
         * If the data is not sorted, interpolation search will not work.
         * It is a required condition otherwise in case of skewed data we
         * perform way worse than binary search
         *
         * In binary search, we always start by checking the middle element.
         * Here, instead of the middle, we calculate a "probe" index based
         * on the target’s expected position relative to array[low] and array[high].
         */


        while(value >= array[low] && value <= array[high] && low <= high)
        {

            int probe =             low     + (high - low) * (value - array[low]) /
                                                  (array[high] - array[low]);


            //System.out.println("probe: " + probe);

            if(array[probe] == value)           return probe;
            else if(array[probe] < value)       low = probe + 1;
            else                                high = probe -1;
        }

        return -1;
    }
}
