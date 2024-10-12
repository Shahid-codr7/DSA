package DS.HashMap;

import java.util.*;
public class MaxChar 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        HashMap<Character,Integer> FreqMap=new HashMap<>();
        System.out.println("Enter String = ");
        String s=in.nextLine();
        char ch='0';
        int i,l=s.length(),max=-1;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(FreqMap.containsKey(ch))
            {
                int fq=FreqMap.get(ch);
                FreqMap.put(ch,fq+1);
            }
            else
            {
                FreqMap.put(ch, 1);
            }
        }
    
        for(char c: FreqMap.keySet())
        {
            if(max<FreqMap.get(c))
            {
                max=FreqMap.get(c);
                ch=c;
            }
        }
        System.out.println("Max Ocureence of "+ch+" is = "+max);
        
    }
    
}
