package DSA.Data_Structures.Beginner.Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        // Queue = FIFO data structure. First-In First-Out
        //		   A collection designed for holding elements prior to processing
        //		   Linear data structure

        // Where are queues useful?

        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // when we typed so fast that our computer don't process the keys as fast so they are transferred
        // to a buffer (Queue) and wait their turn to display on the screen

        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

        Queue<String> queue = new LinkedList<>();
        Queue<String> test  = new LinkedList<>();

        /*
        * We declare Queue as linked list to overcome the thing
        * that ... Queue is an interface we need to declare almost 18 functions
        * to overcome this we use linked list
        * it is like queue but with some other functions
        * a separate section of linked list will be in Queue check that out.
        * */

        /*
        * We get two ways to add    values in Queue -> add(value)    & offer(value)
        * We get two ways to remove values in Queue -> remove(value) & poll()
        * We get two waya to peek   values in Queue -> element()     & peek()
        * */

        /*
        * offer, poll and peek can get no exception as they are safe alternates of
        * add, remove and element respectively
        * */

        queue.add("JoJo's Bizarre Adventure");
        queue.offer("Dragon Ball Super");
        queue.add("Dr Stone");
        queue.offer("One Piece");
        queue.add("Tokyo Ghoul");
        System.out.println("All elements ->" + queue);
        //as seen here we can add elements by both functions but add can have OutOfBound exception

        System.out.println();

        queue.remove();                     //removes JoJo's Bizarre Adventure
        queue.poll();                       //removes Dragon Ball Super
        queue.remove("One Piece");       //removes One Piece even though Dr Stone is at head
        System.out.println("Elements left after removing ->" + queue);
        /*
        * well main difference between this is that remove can
        * delete the head when empty like poll() but it will remove the element
        * passed to it.
        * But it will have NoSuchElement Exception if the queue is empty
        * */

        //test case for remove() throwing error if the queue is empty
        try
        {

            test.remove();

        } catch (NoSuchElementException e)
        {

            System.out.println("remove() will throw NoSuchElementException if queue is empty");

        }

        //test case for poll() to see if it will throw NoSuchElementException
        test.poll();

        System.out.println();

        System.out.println("Head found using peek()    ->" + queue.peek());
        System.out.println("Head found using element() ->" + queue.element());
        /*
        * similarly like remove() element() will encounter
        * NoSuchElementException, hence peek() is more safe to use
        * with Queues
        * */

        //test case
        try
        {

            test.element();

        } catch (NoSuchElementException e)
        {

            System.out.println("element() will throw NoSuchElementException if queue is empty");

        }

        //test case for peek() to see if it will throw NoSuchElementException
        test.peek();

        /*
        * Now for some very useful methods which we inherit from the Collections framework
        * these are:
        * .isEmpty()            -> checks if queue is empty and returns a boolean value
        * .size()               -> gives the size of the queue
        * .contains(element)    -> check if the queue contains the element and returns a boolean value
        * */

        System.out.println();

        //here we see that .isEmpty() is used to see if the following are empty or not
        System.out.println("Is queue Empty : " + queue.isEmpty());
        System.out.println("Is test  Empty : " + test.isEmpty());

        System.out.println();

        //here we get teh size of the queue with .size() method
        System.out.println("Size of queue is : " + queue.size());
        System.out.println("Size of test  is : " + test.size());

        System.out.println();

        //here we find if the queue contains element 'n' for .contains(n)
        System.out.println("Does queue contain Tokyo Ghoul : " + queue.contains("Tokyo Ghoul"));
        System.out.println("Does test  contain Tokyo Ghoul : " + test.contains("Tokyo Ghoul"));

    }
}
