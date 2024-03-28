import java.util.Scanner;
class matrix_addition
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the rows:");;
        int r=s.nextInt();
        System.out.println("Enter the columns:");
        int c=s.nextInt();
        System.out.println("Numbers please:");
        int[][] mat1=new  int[r][c];
        int[][] mat2=new  int[r][c];
        int[][] res=new  int[r][c];
        System.out.println("mat1 numbers:");

        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat1[i][j]=s.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("mat2 numbers:");

        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat2[i][j]=s.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                
                res[i][j]=mat1[i][j]+mat2[i][j];
            }}
            System.out.println("Sum of the matrix:");

        
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }





    }
}