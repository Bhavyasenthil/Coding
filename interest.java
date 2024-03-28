import java.util.Scanner;
class interest
{
public static void main(String args[])
{
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the principle amount:");
   int p=s.nextInt();
   float r=s.nextFloat();
   int n=s.nextInt();
   float SI=(p*n*r)/100;
   System.out.println(SI);
}   
}