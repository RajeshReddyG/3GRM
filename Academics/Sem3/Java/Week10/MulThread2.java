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
class MulThread2
{
	public static void main(String R[])
	{
		RThread1 r1=new RThread1("One");
		RThread1 r3=new RThread1("Three");
		RThread2 r2=new RThread2("Two");
		
		r1.start();
		r2.start();
		r3.start();
		System.out.println("Hello Iam : "+Thread.currentThread().getName());
		
		
		/*for(int i=1;i<=2;i++)
		{
			"RThread"+i+" "+"r"+i+"=new"+" "+"RThread"+i+"(One"+i+")";
		}*/
	}
}
