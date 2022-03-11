import java.util.*;

class narith
{
	static int add(int a,int b) {
	for (int i=1;i<=b;i++)
	{
	a++;
	}
	return a;
}
/*
static int Add(int a, int b)
{
  if (b == 0)
    return a;
  else
    return Add(a^b,(a&b)<<1);
}
*/
public static void main(String[] args) 
{
	int a = add(10,32); 
	System.out.print(a); 
}
}
