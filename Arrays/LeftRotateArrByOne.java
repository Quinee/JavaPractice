package Arrays;
import java.util.Arrays;
public class LeftRotateArrByOne {
    public static void main(String[] args)
    {
        int[] arr={3,4,5};//4,5,3
        System.out.println("Origianl Array:"+Arrays.toString(arr));
        int temp=arr[0];

        for(int i = 1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println("After rotating:"+Arrays.toString(arr));
    }
    
}
