import java.util.*;

class Odd
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i+=2)
		{
		if(n%2==0)
			System.out.println("Entered number is Even"+i);
		else
			System.out.println("Entered number is Odd"+i);
		}
	}
}