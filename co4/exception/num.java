import java.util.Scanner;

class neg extends Exception 
{
	public neg(String str)
	{
		super(str);
	}
}

class nums
{
	int n,i,sum=0,x,avg;
	void avg() throws neg
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit: ");
		n=sc.nextInt();
		System.out.println("Enter the Numbers");
		for(i=0;i<n;i++)
		{
			x=sc.nextInt();
			if(x<0)
			{
				throw new neg("Negative Numbers not Allowed");
			}
			else
			{
				sum=sum+x;
				avg=sum/n;
			}
		}
	System.out.println("Average is: "+avg);
	}
}

class num
{
	public static void main(String args[])
	{
		try
		{
			nums a=new nums();
			a.avg();
		}
		catch(neg e)
		{
			System.out.println("Exception Occured "+e);
		}
	}
}