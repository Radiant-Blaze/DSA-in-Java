package DSA.Algorithms.Search_Algorithms.Binary_Search.User_Defined;

public class Main
{
    public static void main(String[] args)
    {
        int array[] = new int[1000000];
        int target = 777777;

        for(int i = 0; i < array.length; i++) array[i] = i;     //enter the values in the array

        int index = binarySearch(array, target);                //calling the used defined function
        System.out.println("Index : " + index);                 //we will see the target's index
    }

    private static int binarySearch(int[] array, int target)
    {

        int low = 0;                        // start of the array
        int high = array.length - 1;        // end   of the array

        while(low <= high)                  // we will do this until we get a singular value
        {

            int middle = low + (high - low) / 2;        //formula for middle value
            int value = array[middle];

            if(value < target) low = middle + 1;        // if our target is in second RHS side
            else if(value > target) high = middle - 1;  // if our target is in first  LHS side
            else return middle;                         //target found
        }

        return -1;
    }


}
