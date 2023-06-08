/*
 * Problem Statement > Remove duplicates from Sorted Array (Solution 2 Using Set)
 */

package Arrays;
import java.util.*;

public class RemoveDupsUsingSet {
    public static void main(String[] args)
    {
        int[] arr={1,1,2,2,3};

        Set<Integer> hset =new TreeSet<>();

        for (int i : arr)
        hset.add(i);

        System.out.println("Using Set:"+hset.toString());
    }
    
}
