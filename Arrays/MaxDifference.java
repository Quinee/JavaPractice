/*
 * Maximum Difference problem is to find the maximum of arr[j] - arr[i] where j>i.
 * input > {2,3,10,6,4,8,1}
 * output > 8 (since, max diff is 10-2)
 * For this we need to subtract an elem with the minimum value element
 */
package Arrays;

public class MaxDifference {
    public static void main(String[] args)
    {
        int[] arr={2,3,10,6,4,8,1};
        int max_difference=arr[1]-arr[0];
        int min_value=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            max_difference=Math.max(max_difference, arr[i]-min_value);
            min_value=Math.min(min_value, arr[i]);
        }
        System.out.println("Maximum difference is: "+max_difference);
    }
    
}
