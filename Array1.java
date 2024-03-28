class Array1{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] newarr=java.util.Arrays.copyOf(arr,arr.length);
        System.out.println("Copied array:"+java.util.Arrays.toString(newarr));
    }
} 