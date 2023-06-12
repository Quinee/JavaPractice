/*
 * Find frequencies of numbers present in an array
 */
package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequenciesInAnArray {
    public static void main(String[] args)
    {
        int[] arr={40,40,10,10,10,20,30,30};
        Map<Integer,Integer> hmap=new TreeMap();

        for(int i : arr)
        {
            if(hmap.containsKey(i))
            hmap.put(i, hmap.get(i)+1);
            else
            {
                hmap.put(i, 1);
            }
            
        }
        //entry_set=hmap.entrySet();

        for(Map.Entry<Integer,Integer> entries: hmap.entrySet())
        System.out.println(entries.getKey()+" :: "+entries.getValue());
    }
    
}
