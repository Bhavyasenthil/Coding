import java.util.Scanner;
class recursive{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=s.nextInt();
        methodo(n);
    }
    public static void methodo(int n){
        if(n==1){
           System.out.println(1);
        }
        else{
           System.out.println(n);
           methodo(n-1);
        }
    }
}