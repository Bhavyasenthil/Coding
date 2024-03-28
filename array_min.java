class array_min{
    public static void main(String args[]){
        int[] arr={10,20,54,78,10,9,87,20,9,78,568,3};
        System.out.println(minimum(arr));
        
    }
    static int minimum(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
              min=arr[i];
        }
        return min;
    }
}