package Arrays;
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args)
    {
        int[] arr={3,4,0,1,0};//3,4,1,0,0 //3,4,0,1 //3,4,1,0
        int position_of_zero=0;

        for(int indx=0;indx<arr.length;indx++)
        {
            if(arr[indx]!=0)
            {
                //swap(arr[indx] with index of 0)
                int temp=arr[position_of_zero];
                arr[position_of_zero]=arr[indx];
                arr[indx]=temp;
                position_of_zero++;
            }
        }
        System.out.println("After moving:"+Arrays.toString(arr));
    }
    
}
