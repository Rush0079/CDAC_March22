class patt21
{
	public static void main(String []args)
	{
		for(int i=0;i<=5;i++)
		{
			for(int l=4;l>=i;l--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}