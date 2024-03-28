import java.util.Arrays;
import java.util.Collections;
class alpha_builtin
{
  public  static void main(String args[])
  {
    String[] wordData={"Apple","Mango","Cucumber","Banana","Fruits"};
    System.out.println(Arrays.toString(wordData));
    Arrays.sort(wordData);
    System.out.println(Arrays.toString(wordData));
    Arrays.sort(wordData,Collections.reverseOrder()); 
    System.out.println(Arrays.toString(wordData));
  }
} 