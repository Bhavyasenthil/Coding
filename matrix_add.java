import java.util.Scanner;
class matrix_add
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int r=3;
        int c=3;
        int[][] arr=new int[r][c];
        for(int i=0;i<arr.length;i++)
         {
          for(int j=0;j<arr.length;j++)
            arr[i][j]=s.nextInt();
         }
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr.length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println(" ");
        }
    }
}