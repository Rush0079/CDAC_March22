class patt10
{
	public static void main(String args[])
		{
			int a = 65;
			for(int i=4;i>=0;i--)
			{
				for(int j=i;j>=0;j--)
					{
						System.out.print(" ");
					}
				
				for(int k=i;k<=4;k++)
					{
						System.out.print((char)(a+k)+" ");
					}
			System.out.println();	
			}
		}
}
