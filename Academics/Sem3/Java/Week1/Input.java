//Input
import java.io.*;
class Input
{
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	String s1=br.readLine();
	int x=Integer.parseInt(s1);

	String s2=br.readLine();
	double d=Double.parseDouble(s2);

	String s3=br.readLine();
	char c=s3.charAt(0);


System.out.println("x+d="+(x+d)+"\n"+c);
	}
}
