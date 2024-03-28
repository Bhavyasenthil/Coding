import java.util.Scanner;
class Array3{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
            }
            System.out.println();
        java.util.Arrays.sort(arr);        
        System.out.print(java.util.Arrays.toString(arr));

    }
}