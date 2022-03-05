//15. Write a Java program to swap two variables. 

import java.util.*;

class swap15
{
	public static void main(String []args)
	{ 
       int a,b,c;  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of a and b");  
       a = sc.nextInt();  
       b = sc.nextInt();  
       System.out.println("before swapping numbers: "+a+"  "+b);  
     
       c = a;  
       a = b;  
       b = c;  
       System.out.println("After swapping: "+a+"   " +b);  
       System.out.println( );  
	}
}

/*  without using 3rd variable
import java.util.*;  
class Swap   
{  
    public static void main(String a[])   
    {   
        System.out.println("Enter the value of a and b");  
        Scanner sc = new Scanner(System.in);  
         
        int a = sc.nextInt();  
        int b = sc.nextInt();  
        System.out.println("before swapping numbers: "+a+" "+b);  
        
        a = a + b;   
        b = a - b;   
        a = a - b;   
        System.out.println("After swapping: "+a+"  "+b);   
    }   
}  
*/