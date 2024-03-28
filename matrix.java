import java.util.Scanner;  
class matrix{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int row=s.nextInt();
    System.out.println("Enter the number of columns:");
    int column=s.nextInt();
    int[][] a=new int[row][column];
    int sum=0;
    int square=0;
    double result=0;
    System.out.println("Enter the matrix:");
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            a[i][j]=s.nextInt();
        }
    }
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(i==j){
                sum=sum+a[i][j];
            }
        }
    }
    System.out.println("The trace of the matrix:"+sum);
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            square=square+(a[i][j]*a[i][j]);    
        }
    }
    result=Math.sqrt(square);
    System.out.println(result);
}
}