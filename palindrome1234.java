package palindrome;
import java.util.Scanner;

public class palindrome1234 {
	public static void main(String []args)
	{
		Scanner h=new Scanner(System.in);
		String s=h.nextLine();
		int n=s.length();
		int ii;
		int abcd=0;
		for(ii=0;ii<n/2;ii++)
		{
			if(s.charAt(ii)!=s.charAt(n-ii-1))
			{
				abcd=1;
				break;
			}
		}
		if(abcd==0)
			System.out.println("given string is palindrome");
		else
			System.out.println("given String is not palindrome");
	}

}
