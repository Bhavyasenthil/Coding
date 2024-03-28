import java.util.Arrays;
class sort
{
    public static void main(String args[])
    {
      String[] str={"Apple","Orange","Banana","Grapes"};
      System.out.println("Before string method:");
      System.out.println(Arrays.toString(str));
      Arrays.sort(str);
      System.out.println("After string methods:");
      System.out.println(Arrays.toString(str));

    }
} 