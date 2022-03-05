import java.util.Scanner;
class Oct21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal number : ");
		int e= sc.nextInt();
		int []ar = new int[1000];
		//rem = 0;
		int i=0;
		int f=0;
		while(e!=0){
					int rem=e%8;
					e=e/8;
					ar[i]=rem;
					i++;
		}
		for(int k = i-1;k>=0;k--){
		System.out.print(ar[k]);
		}
	}
}
