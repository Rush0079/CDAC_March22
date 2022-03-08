/*class patt6
{
	public static void main(String []args)
	{
		//int n = 5;
		for(int i=0;i<=5;i++)
		{
			for(int j=2*(5-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
*/



class patt6
{
	public static void main(String []args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int l=4;l>=i;l--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}