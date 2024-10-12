package DS.ArrayList_Java;
import java.util.*;
public class ArrayList_Basics 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        // add
        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println(list1);

        // Add at specific position
        list1.add(1,879);
        System.out.println(list1);

        //get
        System.out.println(list1.get(2));

        //set
        list1.set(2,399);
        System.out.println(list1.get(2));

        //remove
        list1.remove(2);
        System.out.println(list1);

        //size
        System.err.println(list1.size());



        
    }

    
}