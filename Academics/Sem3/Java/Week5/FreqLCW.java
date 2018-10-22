// No. of Lines
import java.util.*;
import java.io.*;
class FreqLCW
{
	public static void main(String args[])throws IOException
	{
		FileInputStream f = new FileInputStream("E:/asd.txt");
		int lc=0,i,cc=0,wc=0;
		
		while((i=f.read())!=-1)
		{
			cc++;
			if(i==' ')
			{
				wc++;
				cc--;
			}
			else if(i=='\n')
			{
				lc++;
				wc++;
				cc--;
			}
		}
		//cc=cc-lc;
		System.out.println("Chars:"+(cc-1)+"\nWords:"+(wc+1)+"\nLines:"+(lc+1));
	}
}
