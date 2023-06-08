/*
 * Problem Statement > Find second largest element from Array
 */

package Arrays;

public class SecondLargestElem {
    //>,==,<
    public static void main(String[] args) {

        int max_num=0;
    int second_max=-1;

    int[] arr={2,3,4,1};//3

    for(int n : arr)
    {
        int temp=0;
        if(n > max_num)
        {
            temp=max_num;
            max_num=n;
            second_max=temp;
        }
        else if (n < max_num)
        {

                if( n > second_max || second_max==-1)
                second_max=n;
        }
    }
    System.out.print("Second max num is: "+second_max);

    }

    
    
}
