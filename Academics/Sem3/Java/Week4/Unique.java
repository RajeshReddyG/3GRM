//To Print Unique INPUT Nums.
import java.util.Scanner;
class Unique
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner S=new Scanner(System.in);
		System.out.println("Give 5 Nums.:");
		for(int i=0;i<5;i++)
		{
			a[i]=S.nextInt();
			if(a[i]<=10||a[i]>=100)
			{
				System.out.println("Give Nums b/w 10 to 100");
				return;
				//break;
			}
				
		}
		int i,j;
		System.out.println("Unique Nums Are:");
		for(i=0;i<5;i++)
		{
			int d=1;
			for(j=0;j<5;j++)
			{
				if((i!=j)&&(a[i]==a[j]))
				{
					d=0;
					
				}
			}
			if(d==1)
			{
			  
			  System.out.println(a[i]);
			}
		}
		//System.out.println("Unique Nums Are:");
	}
}
			
	
