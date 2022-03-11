public class reverse  
{  
	public static void main(String[] args)   
	{  
		int n = 4321, rev = 0;  
		while(n!=0)   
		{  
			int remainder = n%10;  
			rev = rev*10 + remainder;  
			n = n/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);  
	}  

/*
public class reverse   
{  
	public static void main(String[] args)   
	{  
		int n = 4321, rev = 0;    
		for( ;n!=0; n=n/10)   
		{  
			int remainder = n%10;  
			rev = rev*10 + remainder;  
		}  
	System.out.println("The reverse of the given number is: " + rev);  
	}  
}  
*/