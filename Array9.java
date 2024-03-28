import java.util.*;
class Array9{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(10);
        arr.add(40);
        arr.add(30);
        //Iterating the element
        Iterator itr=arr.iterator();
        while(itr.hasNext()){
            System.out.print((itr.next()+" "));
        }
        }
}
