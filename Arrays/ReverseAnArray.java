/*
 * Problem Statement > Reverse and Array
 */

package Arrays;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) 
    {
        int arr[]={4,2,3,11};
        System.out.println("Array is:"+Arrays.toString(arr));

        int low=0;
        int high=arr.length-1;

        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        System.out.println("After reversal:"+Arrays.toString(arr));
    }
    
}
