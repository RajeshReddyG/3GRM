//Creating Thread by Runnable Interface
class RThread implements Runnable
{
	public void run()
	{
		System.out.println("Hay.... RThread is running Now...!!!\n\n");
	}
}
class ThreadCrByRunn
{
	public static void main(String R[])
	{
		RThread r=new RThread();
		Thread t=new Thread(r);
		t.start();
	}
}
