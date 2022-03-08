import java.util.*;
public class patt32
{
    public static void main(String[] args)
    {
		for(int i=1;i<=6;i++)
        {
			for(int l=5;l>=i;l--)
			{
				System.out.print(" ");
			}
            for(int j=1;j<=i;j++)                
            {
				if(j==1 || i==6 || i==j)
                System.out.print("*");
				else
				System.out.print(" ");
            }
		System.out.println();
        }
    }
}