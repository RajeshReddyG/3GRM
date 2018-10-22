//Creating Thread by Runnable Interface
class RThread implements Runnable
{
	public void run()
	{
		System.out.println("Hay.... RThread is running Now...!!!\n\n");
	}
}
class MainTrace
{
	public static void main(String R[])
	{
		System.out.println("Hello Iam main and my DETAILS : \n\n\t"+Thread.currentThread());
		RThread r=new RThread();
		Thread t=new Thread(r);
		t.start();
	}
}
