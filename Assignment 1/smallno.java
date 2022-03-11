class smallno
{
	public static void main(String []args)
	{
		int a,b,c;
		a=20;
		b=7;
		c=10;
		
		if(a<=b && a<=c)
			System.out.println("a is smallest");
		else if(b<=a && b<=c)
			System.out.println("b is smallest");
		else
			System.out.println("c is smallest");
	}
}