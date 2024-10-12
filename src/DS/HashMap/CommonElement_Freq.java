package DS.HashMap;
import java.util.*;

public class CommonElement_Freq 
{
    public static void main(String[] args) 
    {
        int A[]={5,6,7,4,3,4,0};
        int B[]={7,8,96,7,4,5,5};
        CommonElement_Freq ob = new CommonElement_Freq();
        ob.findIntersection(A, B);
    }
    public void findIntersection(int[] A, int[] B) 
    {
        int i;
        HashMap <Integer,Integer> A1= new HashMap<>();
        HashMap <Integer,Integer> B1= new HashMap<>();
        for(i=0;i<A1.size();i++)
        {
            if(A1.containsKey(A[i]))
            {
                int value=A1.get(A[i]);
                A1.put(A[i],value+1);
            }
            else
            A1.put(A[i],0);
        }
        for(i=0;i<B1.size();i++)
        {
            if(B1.containsKey(B[i]))
            {
                int value=B1.get(B[i]);
                B1.put(A[i],value+1);
            }
            else
            B1.put(B[i],0);
        }
        System.out.println(A1);
        for(Integer I:A1.keySet())
        {
            if(B1.containsKey(I))
            {
                int k=Math.min(A1.get(I),B1.get(I));
                A1.put(I,k);
            }
        }
        System.out.println(A1);

    }
}
