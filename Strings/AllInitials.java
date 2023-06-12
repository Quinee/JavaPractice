package Strings;

public class AllInitials {
    public static void main(String[] args)
    {
        System.out.println(allInitials("Today is Monday"));

    }
    
    public static String allInitials(String str)//Today is Monday //TiM
    {
        String outputValue="";
        String[] str_splitted=str.split(" ");
        for(String str_values: str_splitted)
        {
            outputValue=outputValue+String.valueOf(str_values.charAt(0));
        }

        return outputValue;
    }
}
