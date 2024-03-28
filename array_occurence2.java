class array_occurence2{
    public static void main(String[] args){
        int arr[]={10,20,54,78,10,9,87,20,9,78,568,3};
        int max=arr[0];
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
           System.out.println("Maximum number:"+max);
           for(int i=0;i<arr.length;i++)
           if(max==arr[i]){
            count++;
           }
           System.out.println(count);
        }
}
