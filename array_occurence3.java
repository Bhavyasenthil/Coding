class array_occurence3{
     public static void main(String[] args){
          int arr[]={10,20,54,78,10,9,87,20,9,78,568,3};
          int i,j;
          int maxcount=0,freq=0;
           for(i=0;i<arr.length;i++){
                int count=0;
                for(j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j])
                    count++;
                }
                

                    if(count>maxcount)
                    {
                        maxcount=count;
                        freq=arr[i];
                        
                    }
                }
                    System.out.println(freq);
            }}

    
    
    
    

