import java.io.*;
class Finally 
{
	public static void main(String Raj[])throws FileNotFoundException
	{
		FileInputStream f = new FileInputStream("Z:/Sem3/Java/Week6/nam.txt");
		System.out.println("I Will Not Execute......!!!");
		System.out.println("Hay...Iam Executing...! After catch & Finally");
	}
}
