package DSA.Comparison.ArrayList_versus_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        // ****************LinkedList****************
        startTime = System.nanoTime();

        linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
        //linkedList.remove(500000);
        //linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime +" ns");

        // ****************ArrayList****************

        startTime = System.nanoTime();

        arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        //arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime +" ns");

        /*
        * Well here we can see that arraylist is faster in accessing data at anyplace
        * but as this is doubly linked list we can only access data faster in end or start but the dat in middle will take much longer to access
        *
        * also removing or adding data in arraylist is linear, like at end it will be fast but the near you are from start the more time it takes to manipulate data there,
        * but we can add or remove elements from the linked list fast from anywhere
        * */

    }
}
