class RThread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(10);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class ThreadByTClass
{
	public static void main(String R[])
	{
		RThread1 r=new RThread1();
		r.start();
		try
		{
			for(int i=10;i>=0;i--)
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
