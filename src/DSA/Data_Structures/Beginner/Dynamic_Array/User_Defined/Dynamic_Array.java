package DSA.Data_Structures.Beginner.Dynamic_Array.User_Defined;

public class Dynamic_Array
{

    //YO THIS IS THE BASIC IMPLEMENTATION OF ARRAYLIST

    int size;
    int capacity = 10;
    Object[] array;     //we use string of objects to store the data

    /*
    * Hey so the below line code starting from here till before object function "line 38"
    * we can make a dynamic array without giving any size like if we do this
    *
    * Dynamic_Array Fruits = new Dynamic_Array(); -> here we will have a default size of "capacity" at line 6
    * and if we do this
    *
    * Dynamic_Array Fruits = new Dynamic_Array(50); -> now here we will have an array of size 50
    *
    * How did we know this?
    *
    * see the functions below in the first on we made an array object with size of 10 as it is predefined for us at line 6
    * but in the second function we gave an argument which will change the default size of array to the one which we specified
    * if you still don't understand it look at line 13 and 16 you will get it by seeing the syntax of declaration
    *
    * well this is the end of the two methods and on to the next one
    * */

    public Dynamic_Array()
    {
        this.array = new Object[capacity];
    }

    public Dynamic_Array(int capacity)
    {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    //YO Till here

    /*
    * Dynamic_Array fruits = new Dynamic_Array();
    *
    * here fruits is an object -> an instance of Dynamic_Array class
    *
    * Inside Dynamic_Array, we use an Object[] to hold our elements.
    * That means every item we store is treated as an Object, no matter
    * whether it’s a String, Integer, or some other class.
    *
    * because of this get method must return an object
    *
    * here we will work on an object where we will give an index of array and get something out of it
    *
    * like if we do this fruits.get(0) -> we will get the element store at index 0 of fruits object
    * but the element we get is a type of object we could need it to be cast back to the original stored type
    *
    * fruits is an object/instance of Dynamic_Array
    * hence every element of fruit must be an object
    * hence every element returned is an object
    *
    * Fruits        -> [a,b,c] -> a,b,c are objects
    * parent object -> child object
    * we are working on child object
    * */

    public Object get(int index) {
        return array[index];
    }

    /*
    * Well before seeing this I recommend you to see grow() and shrink() methods
    *
    * here when we add Object data "as our array is Object datatype" we first check if our array is filled
    * if our array is filled as greater than will not run at any condition we will use grow function() then
    * we add the data to array at index of size, as array[size -1] is filled then we increment the size if user
    * enters another data we will store it at that place.
    * */

    public void add(Object data) {

        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    /*
    * Here we will call grow() if our array is full to make more space for data to be entered.
    *
    * In the for-loop we will start from the last element and shift it to right then the next one until
    * we reach the place where we need to enter data, the array[index] will be null at this time
    *
    * then after theis we place the given data to us at index and increment the size as we added an element
    *
    * e.g.
    *
    * Dynamic_Array numbers = new Dynamic_Array();
    * numbers.add(1);
    * numbers.add(2);
    * numbers.add(3);
    * numbers.add(5);
    * numbers.add(6);
    *
    * Current state:
    * numbers = [1, 2, 3, 5, 6, null, null, null, null]
    * size = 5
    *
    * If we do:
    * numbers.insert(3, 4);
    *
    * The shifting goes like this:
    * Before: [1, 2, 3, 5, 6, null, null, null, null]
    * Step 1: [1, 2, 3, 5, 6, 6, null, null, null]   (shift 6 → index 5)
    * Step 2: [1, 2, 3, 5, 5, 6, null, null, null]   (shift 5 → index 4)
    *
    * Now index 3 is free:
    * [1, 2, 3, 5(here), 5, 6, null, null, null]
    *
    * Insert 4 at index 3:
    * [1, 2, 3, 4, 5, 6, null, null, null]
    *
    * size = 6
    * */

    public void insert(int index, Object data) {

        if(size >= capacity) {
            grow();
        }
        for(int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    /*
     *
     * I was lazy so this is written by GPT
     *
     * The delete(Object data) method removes the first occurrence of the given element
     * from our dynamic array.
     *
     * Step 1: We loop through the array to find the index (i) where the element matches.
     *
     * Step 2: Once found, we use another loop to shift all the elements after index i
     * one step to the left. This fills the "gap" left by the deleted element.
     *
     * Example:
     * numbers = [1, 2, 3, 4, 5, null, null]
     * size = 5
     *
     * delete(3);
     *
     * Inner shifting loop does:
     * j=0 → numbers[2] = numbers[3] => [1, 2, 4, 4, 5, null, null]
     * j=1 → numbers[3] = numbers[4] => [1, 2, 4, 5, 5, null, null]
     *
     * After shifting, the last element is duplicated.
     * We clear it by setting array[size - 1] = null.
     *
     * Final result:
     * [1, 2, 4, 5, null, null, null]
     * size = 4
     *
     * Step 3: If the array becomes too empty (size <= capacity/3),
     * we call shrink() to reduce its capacity.
     */


    public void delete(Object data)
    {

        for(int i = 0; i < size; i++) {
            if(array[i] == data) {
                for(int j = 0; j < (size - i - 1); j++){
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <=(int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {

        for(int i = 0; i < size; i++) {
            if(array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    /*
    * Welcome everybody today we will talk about grow and shrink together like shrink is reverse of grow ,so I will not make a separate portion for shrink
    *
    * when we call grow() function, we will first declare an array with a new capacity
    * how do we do it by this formula (capacity * 2)
    *
    * if capacity = 10 , new capacity = 10 * 2 -> 20 and then we cast it in integer as it can't be a floating point digit
    *
    * now in the for-loop we do this step we will go until the size of array like if capacity is 10 but only 5 places are filled then the size would be 5
    * then we will copy the previous data of small array into a new larger one until we exit the loop
    *
    * now the real steps
    *
    * 1) calculate the new_capacity
    * 2) declare a new array with new_capacity -> Object[] newArray = new Object[newCapacity];
    * 3) copy the previous data into the new array by for-loop
    * 4) let the new_capacity be default as if we need to call grow() another time we use this capacity
    * 5) similarly make the new array default one, Java will auto garbage collect the new_array after this
    *
    * now the shrink is reverse of this. It will shrink the new array to half the size of previous one
    * but the steps are same from 2 -> 5 . just new_capacity is calculated with a new formula
    * */

    private void grow() {

        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {

        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty()
    {
        return size == 0;       // If size is 0, Object array is empty then it will return false else true
    }

    //The toString() method in Java is a fundamental method inherited by all classes from the Object class.
    //Its primary purpose is to return a string representation of an object.
    //Go to Main.java and run it to see what is toString() if you don't understand it

    public String toString() {

        String string = "";

        for(int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if(string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }

    //well this is the end see you later bye bye さよなら　
}