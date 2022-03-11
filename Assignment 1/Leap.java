import java.util.*;

class Leap
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int y = sc.nextInt();
		
		if(y%400==0 && y%4==0)
			System.out.println("Entered year is leap year");
		else
			System.out.println("Entered year is not leap year");
	}
}
