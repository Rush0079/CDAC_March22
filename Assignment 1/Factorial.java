import java.util.*;

class Factorial
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int N = sc.nextInt();
		int fact = 1;
		
		for(int i=1;i<=N;i++)
			fact=fact*i;
		System.out.println("Factorial of a given number is : "+fact);
		
	}
}