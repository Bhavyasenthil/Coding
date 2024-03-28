class revchar
{ 
    public  static void main(String args[])  
    {
        String str="TEMPLE";
        String nstr=" ";
        char ch;
        System.out.println("Original:Temple");
        
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("Reversed word:"+nstr);

        
    }
}