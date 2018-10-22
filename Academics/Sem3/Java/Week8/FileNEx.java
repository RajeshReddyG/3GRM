import java.io.*;
class FileNEx 
{
	public static void main(String Raj[]) 
	{
		try
		{
			FileInputStream f = new FileInputStream("E:/Education/Materials/OOP/asd.txt");
			System.out.println("No Exception Found...\nFile Contents Are:-\n==================\n");
			String l;
			BufferedReader br=new BufferedReader(new InputStreamReader(f));
			while((l=br.readLine())!=null)
			{
				System.out.println(l);
			}
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Your Exception is:\n"+e);
		}
		finally
		{
			System.out.println("Now Iam in FINALLY...!");
		}
		System.out.println("Hay...Iam Executing...! After catch & Finally\n");
	}
}
