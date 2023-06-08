
/*
 * Problem Statement > Find the largest number from Array
 */
package Arrays;

public class LargestElem {
    public static void main(String[] args) {
		
        int[] arr={2,3,4,1};
    int max_num=0;

    for(int i: arr)
    {
        if(i>max_num)
            max_num=i;
    }
    System.out.print("Max number is:"+max_num);

    //System.out.println("Max number is:",max_num);
	}
    
    
}
