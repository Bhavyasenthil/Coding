import java.util.Scanner;
class new_switch2{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int even=0;
        int odd=0;
        int ans=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                ans=n;
            }
            else{
                ans=n;
            }
        }
        System.out.println(switch(ans){
            case 10 -> "even";
            case 13 ->"odd";
            default -> "exception";
        });
}
}
