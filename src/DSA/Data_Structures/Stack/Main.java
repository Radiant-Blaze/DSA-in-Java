package DSA.Data_Structures.Stack;

import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        // stack = LIFO data structure. Last-In First-Out
        //        stores objects into a sort of "vertical tower"
        //		  push() to add objects to the top
        //		  pop() to remove objects from the top
        //
        // Index of stack start's from 1

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        Stack<String> stack = new Stack<>();

        /*
        * here we just created a stack object hence the stack is empty
        * therefore both methods below will be true (both are same)
        * just defined elsewhere
        * as they will return same thing
        */

        System.out.println("Is stack empty : "+ stack.empty());      //is from stack class          (unique method)
        //System.out.println(stack.isEmpty());                       // inherited from vector class (inherited method)

        /*
        * We can push elements into a stack
        * but remember we can run out of space as java heap is small
        * here we will push 4 elements
        * */

        stack.push("House M.D");
        stack.push("Breaking Bad");
        stack.push("Dexter");
        stack.push("911");

        /*
        * we popped the topmost element and stored
        * it into a variable (we can do this too)
        * */

        String Favorite = stack.pop();      // we can store the removed element of the stack
        System.out.println("Favorite show : " + Favorite);

        /*
        * To see the topmost element of the stack we use
        * peek function to see it without removing it from the memory
        * */

        System.out.println("Last Show : " + stack.peek());   //shows the topmost item of the stack

        /*
        * If we search a value that is not in the stack we will get -1 as output
        * also the stack's index start's from 1
        * */
        System.out.println("Index of Dexter : " + stack.search("Dexter"));
        System.out.println("Index of Grey's Anatomy : " + stack.search("Grey's Anatomy"));

    }
}
