package FxnalProgramming;
import java.util.Arrays;

public class EvenNumbersFromArray {
    public static void main(String[] args)
    {
        int[] numbers = {2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
        Arrays.stream(numbers).filter(n-> n%2==0).forEach(System.out::print);
        
    }
    
}
