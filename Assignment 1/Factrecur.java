class Factrecur
{ 
    static int fact=1;
	public static void main(String []args)
	{
		int N = 6;
		Factrecur f = new Factrecur();
		f.calFact(N);
		System.out.println("Factorial of "+N+" is : " +fact);
	}
	void calFact(int N)
	{
		if(N>0)
		{
			fact=fact*N;
			calFact(N-1);
		}
		//return fact;
	}
}