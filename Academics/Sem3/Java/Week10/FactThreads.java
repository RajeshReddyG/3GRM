//Factorial Using THREADS
import java.util.Scanner;
class F
{
	boolean fl=false;
	
	public synchronized void Fact1()
	{
		if(!fl)
		{
			try{
				wait();
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		Scanner S= new Scanner(System.in);
			System.out.println("Give NUM:");
				int num=S.nextInt();
		int fact=1;
		for(int i=num;i>0;i--)
			fact=fact*i;
		System.out.println("Factorial="+fact);
		fl=true;
		notify();
	}
	
	public synchronized void Inp1()
	{
		if(fl)
		{
			try{
				wait();
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
		System.out.println("Input Num is Taken ");
		fl=true;
		notify();
	}
}

class Input implements Runnable 
{
	public static int num;
	F q;
	Input(F q)
	{
		this.q = q;
		new Thread(this, "Input").start();
	}
	public void run()
	{
		while(true)
		{
			q.Inp1();
		}
	}
}

class Factorial implements Runnable 
{
	F q;
	Factorial(F q) 
	{
		this.q = q;
		new Thread(this, "Fact1").start();
	}
	public void run()
	{
		while(true) 
		{
			q.Fact1();
		}
	}
}

class FactThreads
{
	public static void main(String args[]) 
	{
		F q = new F();
		new Input(q);
		new Factorial(q);
		System.out.println("Press Control-C to stop.");
	}
}


