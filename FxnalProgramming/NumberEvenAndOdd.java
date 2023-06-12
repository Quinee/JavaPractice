package FxnalProgramming;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberEvenAndOdd {
    public static void main(String[] args)
    {
        List<Integer>  numbers=Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
        List<Integer> oddNumbers=numbers.stream().filter(n -> n%2!=0).collect(Collectors.toList());
        System.out.println(oddNumbers);

        List<Integer> evenNumbers=numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
    
}
