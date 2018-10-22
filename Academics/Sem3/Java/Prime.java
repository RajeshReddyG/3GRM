import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		int n,p;
		String PN="";
		Scanner s=new Scanner(System.in);
		System.out.println("Give n:");
		n=s.nextInt();
		for(int i=2;i<=n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					p=1;
			}
			if(p==0)
			{
				//PN=PN+i+"     ";
				System.out.println(i);
			}
		}
		//System.out.println("Prime numbers from 1 to "+n+" are :\n"+PN);
	}
}
