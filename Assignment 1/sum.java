import java.util.Scanner;  
//uisng for loop
public class sum 
{  
	public static void main(String arg[])  
	{  
		int j,sum;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a number: ");  
  
		j=sc.nextInt();
		for(sum=0; j!=0; j=j/10)  
		{
		sum=sum+j%10;  
		}   
		System.out.println("Sum of digits: "+sum);  
	}  
} 

/*
using while loop
import java.util.Scanner;  

public class SumOfDigitsExample1   
	{  
	public static void main(String args[])  
	{  
		int number, digit, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		number = sc.nextInt();  
	while(number > 0)  
	{    
		digit = number % 10; 
		sum = sum + digit;    
		number = number / 10;  
	}  
	System.out.println("Sum of Digits: "+sum);  
	}  
}
*/