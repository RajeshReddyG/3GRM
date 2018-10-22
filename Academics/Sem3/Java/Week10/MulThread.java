//Creating Multiple Threads
class RThread1 extends Thread
{
	public void run()
	{
		System.out.println("Hello Iam : "+Thread.currentThread().getName());
	}
	RThread1(String n)
	{
		super(n);
	}
}
class MulThread
{
	public static void main(String R[])
	{
		for(int i=1;i<=4;i++)
		{
			RThread1 r1=new RThread1("Thread "+i);
			r1.start();
		}
			
			
			
			/*RThread1 r2=new RThread1("Two");
			RThread1 r3=new RThread1("three");
			RThread1 r4=new RThread1("four");
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		for(int i=1;i<=4;i++)
			"r"+i+".start()";*/
	}
}
