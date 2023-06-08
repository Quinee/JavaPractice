package Arrays;
import java.util.Arrays;
public class LeftRotateByDPlaces {
    public static void main(String[] args)
    {
        int[] arr={3,4,5,8};//5,8,3,4
        int position_rotate=2;
        //arr rev from 0 to d-1//0 to 1//4,3,5,8
        //arr rev from d to len-1//2 to 3 //4,3,8,5
        //arr rev from 0 to len-1//0 to 3 //5,8,3,4
        System.out.println("Before rotating: "+Arrays.toString(arr));
        array_reverse(arr,0,position_rotate-1);

        array_reverse(arr,position_rotate,arr.length-1);

        array_reverse(arr,0,arr.length-1);

        System.out.println("After rotating: "+Arrays.toString(arr));

    }

    public static void array_reverse(int[] arr,int low,int high)
    {
        
       
        while(low<high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
            
        
    }
    
}
