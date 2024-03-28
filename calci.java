class add{
    public int addition(int n1,int n2){
        int res=n1+n2;
        return res;
    }
}
public class calci{
    public static void main(String[] args){
        int n1=10;
        int n2=20;
        add ad=new add();
        int res= ad.addition(10,20);
        System.out.println(res);
    }
}