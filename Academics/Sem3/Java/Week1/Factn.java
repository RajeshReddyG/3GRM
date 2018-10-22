//Factorial of num
import java.util.Scanner;
class Factn
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Give n:");
		int n=S.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("Fact= "+fact);
	}
}
