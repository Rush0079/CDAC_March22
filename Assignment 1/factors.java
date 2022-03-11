import java.util.*;

class factors
{
    static void printDivisors(int N)
    {
        for (int i=1;i<=N;i++)
            if (N%i==0)
                System.out.print(i+" ");
    }
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int N = sc.nextInt();
        System.out.println("The divisors of 100 are: ");
        printDivisors(N);;
    }
}