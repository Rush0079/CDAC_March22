class patt8
{
	public static void main(String []args)
	{
		int a = 69;
		for(int i=0;i<=4;i++)
		{
			for(int l=4;l>=i;l--)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(a+j)+" ");
			}
			for(int k=i-1;k>=0;k--)
			{
				System.out.print((char)(a+k)+" ");
			}
			System.out.println();
		}
	}
}