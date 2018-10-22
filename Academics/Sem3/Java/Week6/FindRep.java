import java.util.*;
import java.util.regex.*;
import java.io.*;
class FindRep
{
	public static void main(String args[])throws IOException
	{
		FileInputStream f = new FileInputStream("E:/Education/Materials/OOP/asd.txt");
		
		String l;
		BufferedReader br=new BufferedReader(new InputStreamReader(f));
		while((l=br.readLine())!=null)
		{
			String str = l;
			Pattern pat = Pattern.compile("Raj");
			Matcher mat = pat.matcher(str);
			System.out.println("Original sequence: " + str);
			str = mat.replaceAll("asd");
			System.out.println("Modified sequence: " + str+"\n-----------------------------------------");
			
			/*Scanner s = new Scanner(l);
			if(s.findInLine("Raj")==null)
				System.out.println("Not Found");
			else
				System.out.println("Found");*/
			/*if(s.hasNext())
				System.out.println(s.next());
			else
				System.out.println("Error!");*/
		}
	}
}
