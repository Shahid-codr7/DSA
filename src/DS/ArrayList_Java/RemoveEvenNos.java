package DS.ArrayList_Java;
import java.util.*;

public class RemoveEvenNos 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("Enter 4 nos.= ");
        for(int i=0;i<4;i++)
        {
            a.add(in.nextInt());
        }
        for(int i=a.size()-1;i>=0;i--)
        {
            if(a.get(i)%2==0)
            {
                a.remove(i);
            }
        }
        System.out.println(a);
    }
    
}
