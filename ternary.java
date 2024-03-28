class ternary{
    public static void main(String[] args){
        String str="Hello";
        String str1= (str=="hello")? "Correct": "Not";
        System.out.println(str1);
        int x=10;
        int y=20;
        int z=40;
        int large_num=(x>y)?(x>z?x:z):(y>z?y:z);
        int small_num=(x<y)?(x<z?x:z):(y<z?y:z);
        System.out.println(large_num);  
        System.out.println(small_num);

    }
}