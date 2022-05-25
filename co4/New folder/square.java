package graphics;
import java.util.Scanner;
public class square implements ap
{
    Scanner sc=new Scanner(System.in);
    float l,b;
    public void read()
    {
        System.out.println("eneter the length and breadth ");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    public void area()
    {
        float r=l*b;
        System.out.println("area of square="+r);
    }
    public void perimeter()
    {
        float m=2*(l+b);
        System.out.println("area of square="+m);
    }
}
