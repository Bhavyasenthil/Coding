import java.util.Scanner;
class hollow_sphere{
    public static void  main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("radius");
        double R=s.nextInt();
        double r=s.nextInt();
        double v=0;
        if(R>0 && r>0 && R>r){
            v=(4.0/3)*Math.PI*((R*R*R)-(r*r*r));
            System.out.println("VOLUME:"+v);
        }
    }
}