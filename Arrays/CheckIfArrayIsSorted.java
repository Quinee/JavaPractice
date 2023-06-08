/*
 * Problem Statement > Check if the Array is Sorted or not
 */

package Arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
		//System.out.println("Hello World");
        int[] arr={3,4,6,11};//1234
        boolean sorted=true;

        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]<arr[i-1])
            {
                sorted=false;
                break;
            }
        }
        System.out.println("Sorted is:"+sorted);
	}
    
}
