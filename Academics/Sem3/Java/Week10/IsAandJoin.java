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

class RThread2 extends Thread
{
	public void run()
	{
		System.out.println("Hello Iam : "+Thread.currentThread().getName());
	}
	RThread2(String n)
	{
		super(n);
	}
}
class IsAandJoin
{
	public static void main(String R[])throws InterruptedException
	{
		System.out.println("Hello Iam : "+Thread.currentThread().getName());
		RThread1 r1=new RThread1("One");
		RThread2 r2=new RThread2("Two");
		r1.start();
		r1.join();
		r2.join();
		r2.start();
		
		System.out.println("RThread1 is : "+r1.isAlive());
		System.out.println("RThread2 is : "+r2.isAlive());
		System.out.println("Main is : "+Thread.currentThread().isAlive());
	}
}
