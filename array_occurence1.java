import java.util.Scanner;
class array_occurence1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
         System.out.println("Numbers"+arr[i]+":"+count);
        }
    }
}