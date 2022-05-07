import java.util.*;
public class array_search
{
	public static void main(String args[])
	{
	int limit,n,i,item,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter limit");
	limit=sc.nextInt();
	int a[]=new int[limit];
	System.out.println("Enter elements");
	for(i=0;i<limit;i++)
	{
	a[i]=sc.nextInt();
	}
	//search element
	System.out.println("Element to search");
	item=sc.nextInt();
	for(i=0;i<limit;i++)
	{
	if(item==a[i])
		flag=1;
		
		//return 0;

	}
	if(flag==1)
		System.out.print("element "+item+" is found");
	else
		System.out.print("element "+item+" is not found");
	
	}
	//return 0;

}