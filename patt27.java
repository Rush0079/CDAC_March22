class patt27
{
	public static void main(String []args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int l=4;l>=i;l--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}