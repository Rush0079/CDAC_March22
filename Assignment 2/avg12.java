/*12. Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers.
*/

import java.util.*;

class avg12
{
	public static void main(String []args)
	{
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st no. : ");
		a = sc.nextInt();
		System.out.print("Enter 2nd no. : ");
		b = sc.nextInt();
		System.out.print("Enter 3rd no. : ");
		c = sc.nextInt();
		
		System.out.println("Avg of the numbers : "+((a+b+c)/3));
	}
}