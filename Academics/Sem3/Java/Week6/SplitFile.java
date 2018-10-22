//To Split A File
import java.util.*;
import java.io.*;
class SplitFile
{
	public static void main(String args[])throws IOException
	{
		FileInputStream f = new FileInputStream("Z:/Sem3/Java/Week6/LabFile.txt");
		int c=1;
		String l;
		BufferedReader br=new BufferedReader(new InputStreamReader(f));
		while((l=br.readLine())!=null)
		{
			FileWriter fout = new FileWriter("LabFile.part"+c);
			fout.write(l);
			fout.close();
			c++;
		}
	}
}

