package DSA.Data_Structures.Beginner.Linked_List;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        /*
        * TL;DR
        * small data set                                    : LinkedList = BAD
        * large data set + lots of searching                : LinkedList = BAD
        * large data set + lots of inserting/deleting       : LinkedList = GOOD

        * */

        // LinkedList =  Nodes are in 2 parts (data + address)
        //               Nodes are in non-consecutive memory locations
        //               Elements are linked using pointers

        // ALL THE FOLLOWING ADVANTAGES AND DISADVANTAGES ARE EXPLAINED BELOW SECTION 5

        //    advantages?
        //    1. Dynamic Data Structure (allocates needed memory while running)
        //    2. Insertion and Deletion of Nodes is easy. O(1)
        //    3. No/Low memory waste

        //    disadvantages?
        //    1. Greater memory usage (additional pointer)
        //    2. No random access of elements (no index [i])
        //    3. Accessing/searching elements is more time consuming. O(n)

        //    uses?
        //    1. implement Stacks/Queues
        //    2. GPS navigation
        //    3. music playlist
        //

        LinkedList<String> linkedList = new LinkedList<>();

        /*
        * Hey so as the code is quite big so these as the sections
        *
        * Section 1 : 57  - 83
        * Section 2 : 85  - 134
        * Section 3 : 136 - 165
        * Section 4 : 167 - 214
        * Section 5 : 216 - 282
        * Section 6 : 284
        * */

        /*
        * Hey so linked list can be stack or queue depends on what you use
        * as we inherit both of these classes we can use their methods too.
        * */

        //Section 1
        //First let us use it as a stack

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.push("F");

        System.out.println("Identify as a Stack : " + linkedList); //we used LIFO here
        linkedList.clear();

        //Now lets use it as a queue


        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");

        System.out.println("Identify as a Queue : " + linkedList); //we used FIFO here
        linkedList.clear();

        System.out.println();

        //Section 2
        //we can also use both methods with each other

        linkedList.push("A");
        linkedList.offer("B");
        linkedList.push("C");
        linkedList.offer("D");
        linkedList.push("E");
        linkedList.offer("F");

        System.out.println("Stack first Queue second : " + linkedList);
        linkedList.clear();

        linkedList.offer("A");
        linkedList.push("B");
        linkedList.offer("C");
        linkedList.push("D");
        linkedList.offer("E");
        linkedList.push("F");

        System.out.println("Queue first Stack Second : " + linkedList);
        linkedList.clear();

        /*
        * now you will be like what is this output?
        * but fear not it is easy to understand!
        *
        * in first example:
        *
        * linkedList.push("A");      -> front [ A ]
        * linkedList.offer("B");     -> last  [ A, B ]
        * linkedList.push("C");      -> first [ C, A ,B ]
        * linkedList.offer("D");     -> last  [ C, A, B ,D ]
        * linkedList.push("E");      -> first [ E, C, A, B, D ]
        * linkedList.offer("F");     -> last  [ E, C, A, B, D, F ]
        *
        * Final output -> [ E, C, A, B, D, F ]
        *
        * for second example:
        *
        * linkedList.offer("A");    -> last  [ A ]
        * linkedList.push("B");     -> front [ B, A ]
        * linkedList.offer("C");    -> last  [ B, A, C ]
        * linkedList.push("D");     -> front [ D, B, A, C ]
        * linkedList.offer("E");    -> last  [ D, B, A, C, E ]
        * linkedList.push("F");     -> front [ F, D, B, A, C, E ]
        *
        * Final Output -> [ F, D, B, A, C, E ]
        *
        *  */

        //Section 3

        /*
        * ok so pop and poll will do the same thing
        * as they both remove the head of LinkedList
        * */

        System.out.println();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");

        System.out.println("Original Linked List      : " + linkedList);

        linkedList.pop();
        System.out.println("Linked List after popping : " + linkedList);

        linkedList.poll();
        System.out.println("Linked List after polling : " + linkedList);

        linkedList.clear();
        System.out.println();

        /*
        * Here is the breakdown
        *
        * pop   -> [ A, B, C] "remove head" -> [ B, C]
        * poll  -> [ B, C   ] "remove head" -> [ C ]
        * */

        //Section 4
        /*
        * To add or remove an item from the LinkedList
        * we use add() and remove() methods
        * */

        /*
        * add() can have an element which will be added at the end
        * add() can also an element with index which will add the element at that index
        *
        * index start at 0
        * */

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("D");

        System.out.println("Original List                               : " + linkedList);

        linkedList.add("E");
        System.out.println("Added E at end as no index was specified    : " + linkedList);

        linkedList.add(2, "C");
        System.out.println("Added C at index 2                          : " + linkedList);

        linkedList.clear();
        System.out.println();



        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");

        System.out.println("Original List       : " + linkedList);

        linkedList.remove("E");
        System.out.println("After removing E    : " + linkedList);

        linkedList.remove("H");
        System.out.println("After removing H    : " + linkedList);
        //as H was not in the linked list our list remains unchanged

        linkedList.clear();
        System.out.println();

        //Section 5

        /*
        * .indexOf(n)       -> finds the index of n, is very slow o(n)
        * .peekFirst()      -> show the head ( fist element ) of a linkedList
        * .peekLast()       -> show the tail ( last element ) of a linkedList
        * .addFirst()       -> adds the element at Head ( index : 0 )
        * .addLast()        -> adds the element at Tail
        * .removeFirst()    -> removes the Head ( First element )
        * .removeLast()     -> removes the Tail ( Last element )
        *
        * like the parents we can store the removed elements in a variable
        * */

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");

        System.out.println("Original Linked List    : " + linkedList);
        System.out.println("Index of C is           : " + linkedList.indexOf("C"));
        System.out.println("Index of H is           : " + linkedList.indexOf("H"));

        System.out.println();

        System.out.println("Original Linked List    : " + linkedList);
        System.out.println("Head of linkedList      : " + linkedList.peekFirst());
        System.out.println("Tail of linkedList      : " + linkedList.peekLast());

        System.out.println();


        System.out.println("Original Linked List    : " + linkedList);

        linkedList.addFirst("0");
        System.out.println("After using addFirst    : " + linkedList);

        linkedList.addLast("5");
        System.out.println("After using addLast     : " + linkedList);



        System.out.println();


        System.out.println("Original Linked List       : " + linkedList);

        linkedList.removeFirst();
        System.out.println("After using removeFirst    : " + linkedList);

        linkedList.removeLast();
        System.out.println("After using removeLast     : " + linkedList);

        linkedList.clear();
        System.out.println();



        //last comments

        /*
        * Single Linked List :  [ element | address of next element ]          --> [ element | address of next element ]                                --> [ element | null ]
        * Double Linked List :  [ null | element | address of next element ] <- -> [ address of previous element |element | address of next element ] <- -> [ address of previous element | element | null ]
        *
        * Single Linked list can only be traversed from         : Head -> Tail
        * Double Linked list can      be traversed from         : Head -> Tail and Tail -> Head
        * */

        //Section 6

        //Explanation of advantages and disadvantages

        /*
        * Advantages
        *
        * 1) Unlike array's we can dynamically increase or decrease the memory allocation of
        *    LinkedList unlike arrays. like for declaring arrays we do this -> char a[ number of elements ]
        *    here you see that we need to specify the number of elements which we need to store
        *    but for LinkedList we don't need to specify how large we need the arrays to be like
        *    the declaration syntax of linked list is this  -> LinkedList<datatype> name = new LinkedList<>();
        *    you see here we don't specify how large the LinkedList must be.
        *
        * 2) Well for the insertion or deletion of data for LinkedList is O(1) "Constant" which means that
        *    we can instantaneously add or remove elements form LinkedList. Why? because the thing is
        *    unlike arrays where we need to manually shift the elements to some place like here
        *    [ 1 2 4 5 6] now to make a place after 4 we do these steps
        *
        *    [ 1 2 4 5 _ 6]
        *    [ 1 2 4 _ 5 6]
        *    [ 1 2 _ 4 5 6]
        *    you see how many steps we took, now imagine there were thousands of elements in the array
        *    then we would need to move elements thousands of time. hence the process will be slow
        *    which will be O(n) "Linear" (the time will increase with the number of elements)
        *
        *    now for array list we just do this
        *    [1|a] -> [2|b] -> [4|c] -> [5|d] -> [6|null] , we need to insert element after 2
        *    [1|a] -> [2|f] -> [_|b] -> [4|c] -> [5|d] -> [6|null]
        *    now see here we just changed the pointer of 2 to point to f and for the place left
        *    we point it to 4 which is c.
        *    hence we do insertion and deletion process with O(1), which is  "Constant"
        *
        * 3) Low/None memory " WASTE ". one factor is explained in " 1) ", second one is this
        *    well for this array arr[100], we allocate 100 memory space for this,
        *    but if we only need 5 slots we can't deallocate it
        *    but as LinkedList is dynamically stored it will have no memory waste.
        *
        * Disadvantages
        *
        * 1) Greater memory " USAGE ". well unlike arrays we need to store 1 or 2 pointer location
        *    of next or previous too. hence it will take more memory space than Arrays.
        *    like for EXAMPLE it's just an EXAMPLE
        *    [ 1 2 3 4 5 ]                                                                      ->  take 5  Bytes to store
        *    [1|a] -> [2|b] -> [3|c] -> [4|d] -> [5|null]                                       -> take 10 Bytes
        *    [null| 1 |a] <- -> [e| 2 |b] <- -> [a| 3 |c] <- -> [b| 4 | d] <- -> [c| 5 |null]   -> take 15 bytes
        *    hence LinkedList will take more space then normal arrays
        *
        * 2) No random access. Unlike arrays where we can instantaneously by their address
        *    like if i want to access index 5 i can go there directly
        *    but for LinkedList we need to traverse manually to go to the index as we don't
        *    have the memory location for that specific index. so for accessing data we have
        *    O(n) time constraint. Hence if we need constant data access, LinkedList is bad for
        *    this process
        *
        * 3) Accessing/searching elements is more time consuming. O(n) as explained in " 2) "
        * */


    }
}
