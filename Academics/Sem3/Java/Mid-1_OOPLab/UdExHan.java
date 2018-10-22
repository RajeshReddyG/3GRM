import java.util.Scanner;
class AbcException extends Exception
{
	int var;
	AbcException(int a)
	{
		var=a;
	}
	public void ToString()
	{
		System.out.println("My Exception is "+var);
	}
}
class UdExHan
{
	public static void main(String R[])
	{
		Scanner S=new Scanner(System.in);
		try
		{
			System.out.println("give var1:");
			int v1=S.nextInt();
			System.out.println("give var2:");
			int v2=S.nextInt();
			myFun(v1);
			myFun(v2);
		}
		catch(AbcException e)
		{
			System.out.println("Hay.... I Caught Exception");
			System.out.println("Exception is:  "+e+"\n\n");
		}
	}

	public static void myFun(int a) throws AbcException
	{
		if(a<15)
		{
			System.out.println("-------------------------\nNo Exception\nAddition of a+a is\n");
			System.out.println(a+"+"+a+"="+(a+a)+"\n-------------------------");
		}
		else
			throw new AbcException(a);
	}
}

		
