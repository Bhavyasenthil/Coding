import java.util.Scanner;
class array_occurence{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] arr={10,20,54,78,10,9,87,20,9,78,568,3}; 
        int i;
        System.out.println("Enter the element:");
        int ele=s.nextInt();
        int count=0;
        for(i=0;i<arr.length;i++){
                if(ele==arr[i]){
                count=count+1;
                }}
                System.out.println("number of occuernce of element "+ele+":"+count);
            }} 
