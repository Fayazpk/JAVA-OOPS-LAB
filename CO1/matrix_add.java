//add 2 matrix
import java.util.*;
public class matrix_add
{
	public static void main(String args[])
	{
	int m,n,i,j,p,q,item;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter row size and colum size of matrix1:");
	m=sc.nextInt();
	n=sc.nextInt();
	int a[ ][ ]=new int[m][n];
	System.out.print("Enter row size and colum size of matrix2:");
	p=sc.nextInt();
	q=sc.nextInt();
	int b[][]=new int[p][q];
	int c[][]=new int[p][q];
	if(m==p && n==q)
	{
		System.out.println("Enter elements of matrix1:");
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		}

		System.out.println("Enter elements of matrix2:");
		for(i=0;i<p;i++)
		{
		for(j=0;j<q;j++)
			b[i][j]=sc.nextInt();
		}

		System.out.println("Matrix Addition");
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
			c[i][j]=a[i][j]+b[i][j];
		}

		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
			System.out.print(c[i][j]+" ");
		System.out.println();
		}
		
	}
	else
		System.out.println("Addition is not possible");
	}

}