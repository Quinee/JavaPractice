/*
 * An element is called the leader of an array if there is no element greater than it on the right side.
 * input -> {7,10,4,10,6,5,2}
 * output -> 2 5 6 10
 */
package Arrays;

public class LeadersInAnArray {
    public static void main(String[] args)
    {
        int[] arr={7,10,4,10,6,5,2};
        int current_leader=arr[arr.length-1];
        System.out.println(current_leader);
        for(int i = arr.length-2;i>=0;i--)
        {
            if (arr[i]>current_leader)
            {
                current_leader=arr[i];
                System.out.println(current_leader);
            }
        }
    }
    
}
