class array_maximum{
    public static void main(String[] args)
    {
        int[] arr={10,20,54,78,10,9,87,20,9,78,568,3}; 
        int max=0;
        int maxfreq=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
            else
            break;
        }
            System.out.println(arr[i]+":"+count);
        }
    }
}
    
        