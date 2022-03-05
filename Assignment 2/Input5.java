/*5. Write a Java program that takes two numbers as input and display the product of 
two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/

import java.util.*;

class Input5
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Input First number : ");
		a = sc.nextInt();
		System.out.print("Input second number : ");
		b = sc.nextInt();
		
		int c = a * b;
		System.out.print("Multiplication is : "+c);
	}
}