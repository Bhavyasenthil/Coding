import java.util.Arrays;
import java.util.Collections;
class descending
{
    public static void main(String args[])
    {
        String[] str={"Apple","Orange","Banana","Athi","Carrot","Brinjal"};
        Arrays.sort(str,Collections.reverseOrder());
        
        System.out.print(Arrays.toString(str));
        }}