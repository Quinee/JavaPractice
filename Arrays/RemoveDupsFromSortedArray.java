/*
 * Problem Statement > Remove duplicates from Sorted Array (Solution 1)
 */

package Arrays;
import java.util.Arrays;

public class RemoveDupsFromSortedArray {
    public static void main(String[] args) 
    {
        int[] arr={1,1,2,3,3,4};//1,2,3,4 //1,2,3
        System.out.println("original Array:"+Arrays.toString(arr));
        int count=1;

        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]!=arr[i-1])
            {
                arr[count]=arr[i];
                count++;

            }
        }

        for(int i =0;i<count;i++)
        System.out.println("removing dups:"+arr[i]);
    }
    
}
