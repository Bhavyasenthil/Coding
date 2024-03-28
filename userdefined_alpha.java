import java.util.Arrays;
class userdefined_alpha
{
    public static void main(String args[])
    {
        String[] str={"Apple","Orange","Banana","Athi","Carrot" ,"Brinjal"};
        for(int i=0;i<str.length;i++) { 
         for(int j=i+1;j<str.length;j++)    {
            if(str[i].compareTo(str[j])>0)
            {
            
      
                String temp=str[i];
                
                str[i]=str[j];
                
                str[j]=temp;
                  
            }
          }
        }
        System.out.print(Arrays.toString(str));
        }}