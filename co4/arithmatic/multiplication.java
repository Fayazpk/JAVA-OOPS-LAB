package arithop;
import java.util.Scanner;
public class multiplication implements operation
{
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    public void operation()
    {
        System.out.println("eneter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a*b;
        System.out.println("result:"+c);

    }
}