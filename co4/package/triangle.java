package graphics;
import java.util.Scanner;
public class triangle implements ap
{
    Scanner sc=new Scanner(System.in);
    float l,b;
    public void read()
    {
        System.out.println("eneter the height and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    public void area()
    {
        double r=0.5*(l*b);
        System.out.println("area of trianle="+r);
    }
    public void perimeter()
    {
        float p=l+b;
        System.out.println("perimeterof square="+p);
    }
  
}
