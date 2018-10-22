import java.util.Scanner;
class C2017
{
   public static void main(String args[])
     {
		 String s="12+2+3";
		 
		 String ar[]=new String[5];
		 int j=0,r=0;
		 for(int i=0;i<6;i++)
		 {
			 if(s.charAt(i)=='+'||)
			 {
				 if(j==0)
					r=Integer.parseInt(ar[j]);
				else
					r=r+Integer.parseInt(ar[j]);
					
				 j++;
			 }
			 else if(s.charAt(i)!='+')
			 {
				 if(ar[j]==null)
				 {
					 ar[j]=Character.toString(s.charAt(i));
				 }
				 else
				 {
					 ar[j]=ar[j]+s.charAt(i);
				 }
			 }
		 }
		 r=r+Integer.parseInt(ar[j]);
		 System.out.println(r);
		 
	}
}
/*
 * int number = 49;
		char c = (char)number;
		int d=Character.getNumericValue(c);
		d=d+5;
		System.out.println(d);
		* 
		* s=s+"+1";
		 int a=0;
		 String z="1";
		 int g=Integer.parseInt(z);
 */
 //System.out.println(Integer.parseInt(s));

//a=Integer.parseInt();
//ar[j]=ar[j]+"as";





















/*
 * 
import java.util.Scanner;
class C2017
{
   public static void main(String args[])
     {
		 String s="12+2+3";
		 
		 String ar[]=new String[5];
		 int j=0,r=0;
		 for(int i=0;i<6;i++)
		 {
			 if(s.charAt(i)=='+')
			 {
				 if(j==0)
					r=Integer.parseInt(ar[j]);
				else
					r=r+Integer.parseInt(ar[j]);
					
				 j++;
			 }
			 else if(s.charAt(i)!='+')
			 {
				 if(ar[j]==null)
				 {
					 ar[j]=Character.toString(s.charAt(i));
				 }
				 else
				 {
					 ar[j]=ar[j]+s.charAt(i);
				 }
			 }
		 }
		 r=r+Integer.parseInt(ar[j]);
		 System.out.println(r);
		 
	}
}
* */
