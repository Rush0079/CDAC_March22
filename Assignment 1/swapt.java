class swapt
{
	public static void main(String []args)
	{
		int a,b;
		a=30;
		b=40;
		System.out.println("Values of a & b before swapping are : "+a+" "+b);
		
		a=a+b;//70
		b=a-b;//30
		a=a-b;//40
		
		System.out.println("Values of a & b after swapping are : "+a+" "+b);
	}
}