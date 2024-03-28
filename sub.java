class sub 
{
    public static void main(String args[])
    {
        String s="00098760000";
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
             continue;
            else{
             str=s.substring(i);
             break;
            }
        }
         System.out.println(str);  
        

    }
}