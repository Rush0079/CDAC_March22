class patt35
{
	public static void main(String []args)
	{
		for(int i=0	;i<=9;i++)
		{
			for(int l=8;l>=i;l--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}