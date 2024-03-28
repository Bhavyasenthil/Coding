class revstr
{
    public static void main(String args[])
    {
        String s=("Hi appu");
        String a[]=s.split(" ");

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}