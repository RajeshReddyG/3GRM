//Palindrome Of String
import java.util.Scanner;
class Palin
{
   public static void main(String args[])
     {
	Scanner s=new Scanner(System.in);
	System.out.println("Give String:");
	String s1=s.nextLine();
	StringBuffer sb=new StringBuffer(s1);
	sb.reverse();
	String s2=new String(sb);
	if(s1.equals(s2))
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
	}
}
