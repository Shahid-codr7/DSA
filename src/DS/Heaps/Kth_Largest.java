package DS.Heaps;

import java.util.*;
public class Kth_Largest 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size=in.nextInt();
        int a[]=new int [size];
        int i;
        System.out.println("Enter nos. = ");
        for(i=0;i<size;i++)
        {
            a[i]=in.nextInt();
        }

        System.out.println("Enter K = ");
        int k=in.nextInt();
        PriorityQueue<Integer> hp=new PriorityQueue<>();
        for(i=0;i<k;i++)
        {
            hp.add(a[i]);
        }
        for(i=k;i<size;i++)
        {
            if(a[i]>hp.peek())
            {
                hp.remove();
                hp.add(a[i]);
            }
        }
        System.out.println(hp);
    }
    
}
