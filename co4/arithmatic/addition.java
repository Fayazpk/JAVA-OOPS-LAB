package arithop;
import java.util.Scanner;
public class addition implements operation
{
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    public void operation()
    {
        System.out.println("eneter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.println("result:"+c);

    }
}