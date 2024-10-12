package DS.HashMap;
import java.util.*;
public class Basics
{
    public static void main(String[] args) {
        HashMap<String,Integer> population= new HashMap<>(); //initalize

        //Add O(1)
        population.put("INDIA",37);
        population.put("CHINA",87);
        population.put("Japan",87);


        //Get O(1)
        System.out.println(population.get("INDIA"));
        System.out.println(population.get("Japan"));

        //To check key present or not O(1)
        System.out.println(population.containsKey("INDIA"));

        //TO PRINT KEY AND their Values "O(n)"

        // for(String s: population.keySet())
        // {
        //     System.out.println(s); //In any diff. order
        // }

        String[] keysArray = population.keySet().toArray(new String[0]);
        String s=keysArray[2];
        System.out.println(s);

        //size
        System.out.println(population.size());

        //Remove
        population.remove("INDIA");
        System.err.println(population.containsKey("INDIA"));

        //Print
        System.out.println(population);
    }
}
