import java.util.*;

class pn
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if(n>0)
			System.out.println("Entered number is +ve");
		else
			System.out.println("Entered number is -ve");
	}
}