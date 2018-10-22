//import java.lang.Math()

class Dice
{
	public static void main(String args[])
	{
		int c=0,i,a,b;
		for(i=0;i<=10000;i++)
		{
			a=(int)(Math.random()*4);
			b=(int)(Math.random()*4);
		//System.out.println(a);
		//System.out.println(b);
			if(a==b)
			{
				c=c+1;
			}
		}
		System.out.println("Doubles are Rolled For::"+c);
	}
}
