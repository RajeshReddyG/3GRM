// No. of Lines
import java.util.*;
import java.io.*;
class LineNums
{
	public static void main(String args[])throws IOException
	{
		FileInputStream f = new FileInputStream("E:/Education/Materials/OOP/asd.txt");
		int c=1;
		String l;
		BufferedReader br=new BufferedReader(new InputStreamReader(f));
		while((l=br.readLine())!=null)
		{
			System.out.println((c+"."+l));
			c++;
			//f.close();
		}
	}
}
