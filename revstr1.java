
class revstr1
{
    public static void main(String args[])
    {
        String s="geeks";
        char[] st=s.toCharArray();;
        for(int i=st.length-1;i>=0;i--)
        {
           System.out.print(st[i]);
        }
    }
}