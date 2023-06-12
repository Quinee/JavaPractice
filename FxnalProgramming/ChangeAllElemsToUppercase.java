package FxnalProgramming;

import java.util.Arrays;
import java.util.List;

public class ChangeAllElemsToUppercase {
     public static void main(String[] args) {
        List<String> names= Arrays.asList("Java","Python");
        names.stream().map(str->str.toUpperCase()).forEach(e->System.out.println(e));
        names.stream().map(str->str.length()).forEach(System.out::print);

        List<Integer> nums=Arrays.asList(1,2,3,4);
        //Multiply all the nums with 10 and store in a list
        nums.stream().map(n->n*10).forEach(System.out::print);
    }
    
}
