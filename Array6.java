import java.util.*;
class Array6{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(12);
        list.add(15);
        list.add(10);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println();
        for(int n:list){
            System.out.print(n);
        }
    }
}
