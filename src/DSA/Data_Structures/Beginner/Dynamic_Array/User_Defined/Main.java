package DSA.Data_Structures.Beginner.Dynamic_Array.User_Defined;

public class Main
{
    public static void main(String[] args) {

        Dynamic_Array dynamicArray = new Dynamic_Array(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        //System.out.println(dynamicArray.get(0));
        //dynamicArray.insert(0, "X");
        //dynamicArray.delete("A");
        //System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);                           //toString implementation
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
}
