import java.util.*;
class NestTry 
{
	public static void main(String Raj[]) 
	{
		int a,b;
		Scanner S=new Scanner(System.in);
		try
		{
			try
			{
				System.out.println("Give a:");
				a=S.nextInt();
				b=100/a;
				System.out.println("I Will Not Execute......!!! if a==0\nb= "+b);
			}
			catch(Exception j)
			{
				System.out.println("2.Your Exception is:\n"+j);
			}
			try
			{
				int Ar[]={1,2,3};
				System.out.println("Give Array Index:");
				int i=S.nextInt();
				System.out.println("Array Index of "+i+" is: "+Ar[i]);
			}
			catch(Exception q)
			{
				System.out.println("3.Your Exception is:\n"+q);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Your Exception is:\n"+e);
		}
		finally
		{
			System.out.println("Now Iam in FINALLY...!");
		}
		System.out.println("Hay...Iam Executing...! After catch & Finally");
	}
}

