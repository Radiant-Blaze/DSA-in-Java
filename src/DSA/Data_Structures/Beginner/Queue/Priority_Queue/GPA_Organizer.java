package DSA.Data_Structures.Beginner.Queue.Priority_Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class GPA_Organizer
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Queue<Double> GPA_List = new PriorityQueue<>();

        boolean Running = true;
        double GPA;

        System.out.println("Enter -1 to exit the loop");
        while (Running)
        {
            System.out.print("Enter the GPA : ");
            GPA = scanner.nextDouble();

            if (GPA == -1)
            {
                Running = false;
            }else
            {
                GPA_List.offer(GPA);
            }
        }

        System.out.println();
        System.out.println("GPA List Sorted : ");

        for(Double i : GPA_List)
        {
            System.out.println(i);
        }
    }
}
