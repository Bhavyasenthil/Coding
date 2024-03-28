class Array5{
    public static void main(String[] args){
        int sum=0;
        double average=0;
        int[] a={1,2,3,4,5,7,90,8,8};
        for(int numbers:a){
            sum=sum+numbers;
        }
        System.out.println(sum);
            average=(double)sum/a.length;
        System.out.println(average);
    }
}