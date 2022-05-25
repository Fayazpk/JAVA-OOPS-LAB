import graphics.circle;
import graphics.rectangle;
import graphics.square;
import graphics.triangle;
import java.util.Scanner;
public class shapes{
	public static void main(String args[])
	{

		circle c=new circle();
		rectangle r=new rectangle();
		square s =new square();
		triangle t=new triangle();
		Scanner sc=new Scanner(System.in);
		int opt;
		do
		{
			System.out.println("\nEnter your choice\n1.Rectangle\n2.Circle\n3.square\n4.triangle\n5.Exit\n");
			opt=sc.nextInt();
			switch(opt)
			{
			case 1:r.read();
					r.area();
					r.perimeter();
					break;
			case 2:	c.read();
					c.area();
					c.perimeter();
					break;
			case 3:	s.read();
					s.area();
					s.perimeter();
					break;
			case 4:t.read();
					t.area();
					t.perimeter();
			break;
			
			case 5:break;
			default: System.out.println("Invalid Input!!");

				}

		}while(opt!=5);
	}
}