//symmetric

import java.util.*;
public class matrix_symmetric
{
	public static void main(String args[])
	{
	int m,n,i,j,p,q,item,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter row size and colum size of matrix:");
	m=sc.nextInt();
	n=sc.nextInt();
	int a[ ][ ]=new int[m][n];
	
	int b[][]=new int[m][n];
	
	if(m==n)
	{
		System.out.println("Enter elements of matrix1:");
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		}

		

		System.out.println("transpose");
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
			b[i][j]=a[j][i];
		}

		
		
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
			System.out.print(b[i][j]+" ");
		System.out.println();
		}
		
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
			if(a[i][j] !=b[i][j])
				break;
			else
				flag=flag+1;
		continue;
		}
	
	}
	else
		System.out.println("error");
	if(flag==m*n)
	System.out.println("matrix is Symmetric");
	else
	System.out.println("not symmetric");
	}

}