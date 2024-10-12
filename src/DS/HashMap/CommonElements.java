package DS.HashMap;

import java.util.*;
public class CommonElements 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Array elements = ");   
        int i;
        int b[]=new int[5];
        //Using HashMap as Array to Store  elements of 1st array
        HashMap<Integer,Integer> Map_a=new HashMap<>();
        for(i=0;i<5;i++)
        {
            int n=in.nextInt();
            Map_a.put(n,0);
        }
        for(i=0;i<b.length;i++)
        {
            b[i]=in.nextInt();
        }

        //Checking for Common elements
        System.out.println("Common Elements: ");
        for(i=0;i<b.length;i++)
        {
            if(Map_a.containsKey(b[i]))
            {
                System.out.print(b[i]+" ");
            }
        }    

    }
}
