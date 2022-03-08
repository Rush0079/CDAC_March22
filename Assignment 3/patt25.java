class patt25
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
		for(int k=4;k>=1;k--)
		{
			for(int p=5;p>k;p--)
			{
				System.out.print("  ");
			}
			for(int q=1;q<=k;q++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}