import java.util.Scanner;
class fibonacci
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("Size of the numbers:");
    int n=s.nextInt();
    int[] arr=new int[n]; 
    arr[0]=0;
    arr[1]=1;   
    int sum=0;
    for(int i=2;i<=arr.length-1;i++)
    {
      arr[i]=arr[i-1]+arr[i-2];
       if(i%2==0)
        sum+=arr[i];
    }
    System.out.print(sum);
}
}

