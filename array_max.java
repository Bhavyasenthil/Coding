class array_max{
    public static void main(String args[]){
        int[] arr={10,20,54,78,10,9,87,20,9,78,568,3};
        System.out.println(maximum(arr));
        
    }
    static int maximum(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
              max=arr[i];
        }
        return max;
    }
}