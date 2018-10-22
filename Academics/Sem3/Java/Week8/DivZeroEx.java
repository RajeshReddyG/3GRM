class DivZeroEx 
{
	public static void main(String Raj[]) 
	{
		int a,s;
		try
		{
			a=0;
			s=100/a;
			System.out.println("I Will Not Execute......!!!");
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
