package DS.Heaps;
import java.util.*;
public class Heap_Basics 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> hp=new PriorityQueue<>(Collections.reverseOrder());

        // Add -> O(log n)
        hp.add(10);
        hp.add(80);
        hp.add(20);
        hp.add(980);
        hp.add(10);

        // Remove -> O(log n)
        System.out.println(hp.remove());
        System.out.println(hp.remove());
        // By default Lowest no. is of Higher Priority to Remove()

        // Get -> O(1)
        System.out.println(hp.peek());
        System.out.println(hp.peek());
        System.out.println(hp.peek());

        //Size -> O(1)
        System.out.println(hp.size());





    }
}
