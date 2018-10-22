//prime numbers
class Prime100
{
	public static void main(String[] args)
	{
		int i,j,p;
		System.out.println("Prime Numbers From 100 to 200 is:\n----------------------------------------------------------------------------" );
		for(i=100;i<=200;i++)
		{
			p=100;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					p++;
				}
			}
			if(p==100)
			{
				System.out.print(i+"\t");
			}
		}
		System.out.println("\n----------------------------------------------------------------------------");
	}
}
