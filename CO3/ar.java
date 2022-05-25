import java.util.Scanner;
class sample
{
void area(int a)
{
System.out.println("area of square="+(a*a));
}
void area(int a,int b)
{
System.out.println("area of triangle="+0.5*a*b);
}
void area(double a)
{
System.out.println("area of circle="+3.14*a*a);
}
void area(int a,int b,int h)
{
System.out.println("area of rectangle="+a*b*h);
}
}

class ar
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a,b;
 sample ob=new sample();
//System.out.println("enter the breadth");
//a=sc.nextInt();
//System.out.println("enter the length");
//b=sc.nextInt();
ob.area(7);
ob.area(4,5);
ob.area(5);
ob.area(3,8,9);

}}