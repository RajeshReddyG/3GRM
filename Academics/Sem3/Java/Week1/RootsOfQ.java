//Real And Imaginory Solutions of Q.Eq'n
import java.io.*;
import java.lang.*;
class RootsOfQ
{
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Give a:");
	String s1=br.readLine();
	int a=Integer.parseInt(s1);

	System.out.println("Give b:");
	String s2=br.readLine();
	int b=Integer.parseInt(s2);
	
	System.out.println("Give c:");
	String s3=br.readLine();
	int c=Integer.parseInt(s3);

double d=b*b-4*a*c;
if(d<0)
{
	double r1=-b/(2*a)+(Math.sqrt(-d)/(2*a));
	double r2=-b/(2*a)-Math.sqrt(-d)/(2*a);
	System.out.println("Root1="+r1);
	System.out.println("Root2="+r2);
}
else
{
	double ro1=(-b+Math.sqrt(d))/(2*a);
	double ro2=(-b-Math.sqrt(d))/(2*a);
	System.out.println("Root1="+ro1);
	System.out.println("Root2="+ro2);
}
}
}