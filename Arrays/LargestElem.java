
/*
 * Problem Statement > Find the largest number from Array
 */
package Arrays;

public class LargestElem {
    public static void main(String[] args) {
		
        int[] numberArray={2,3,4,1};
    int maximumNumber=0;

    for(int i: numberArray)
    {
        if(i > maximumNumber)
        maximumNumber = i;
    }
    System.out.print("Max number is:"+ maximumNumber);

    //System.out.println("Max number is:",max_num);
    //Collections, Streams, Java 8 Fxnal programming
	}
    
    
}
