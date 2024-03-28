import java.util.Scanner;
import java.util.Arrays;
class reverse{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in); 
        System.out.print("Enter the size:");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Before sorts:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("after sorts:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
}
}
