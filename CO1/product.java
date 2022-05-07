import java.util.*;
class pdt
{
	Scanner sc = new Scanner(System.in);
	int pcode,price;
	String pname;
	void input()
	{
	System.out.print("enter pcode pname price:");
	pcode=sc.nextInt();
	pname=sc.next();
	price=sc.nextInt();

	}
	
	
}

class product
{
	public static void main(String srgs[])
	{
	Scanner sc=new Scanner(System.in);
	pdt p=new pdt();
	pdt q=new pdt();
 	pdt r=new pdt();

	System.out.println("RECORD 1:");
	p.input();
	System.out.println("RECORD 2:");
	q.input();
	System.out.println("RECORD 3:");
	r.input();

	if(p.price<q.price && p.price<r.price)
		System.out.print(p.pname+" has lowest price");
	else if(q.price<r.price)
		System.out.print(q.pname+" has lowest price");
	else
		System.out.print(r.pname+" has lowest price");
	}

}