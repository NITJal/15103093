package kovid123;

import java.util.Scanner;
	public class primenumber
	{
public static void main(String args[])
{
	int n,i,j,k;
	   Scanner scan = new Scanner(System.in);
	    n= scan.nextInt();
	for(i=2;i<=n;i++)
	{
	int f=0;
	for(j=2;j<i;j++)
	{
		if(i%j==0)
		{
			f=1;
			break;
		}
	}
		if(f==0)
			System.out.println(i);
	}
}
}