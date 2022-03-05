import java.util.Scanner;
class BD22{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter binary number : ");
		int a = sc.nextInt();
		int c=0;
		int i=0;
		while(a!=0){
				int rem=a%10;
				a=a/10;
				c=(int)(rem*Math.pow(2,i)+c);
				i++;
			}
			System.out.println(c);
		
	}
}