import java.util.*;
class MulExHan 
{
	public static void main(String Raj[]) 
	{
		int a,b;
		Scanner S=new Scanner(System.in);
		try
		{
			System.out.println("Give a:");
			a=S.nextInt();
			b=100/a;
			System.out.println("I Will Not Execute......!!! if a==0\nb= "+b);
			int Ar[]={1,2,3};
			System.out.println("Give Array Index:");
			int i=S.nextInt();
			System.out.println("Array Index of "+i+" is: "+Ar[i]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("1.Your Exception is:\n"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("2.Your Exception is:\n"+e);
		}
		finally
		{
			System.out.println("Now Iam in FINALLY...!");
		}
		System.out.println("Hay...Iam Executing...! After catch & Finally");
	}
}

