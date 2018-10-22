import java.util.Scanner;
abstract class Fig
{
	//int l=20,b=30;
	abstract void area(int l,int b);
	//{}
}

class Tri extends Fig
{
	void area(int l,int b)
	{
		System.out.println("Area Of Triangle = "+0.5*l*b);
	}
}

class Rec extends Fig
{
	void area(int l,int b)
	{
		System.out.println("Area Of Rectangle = "+l*b);
	}
}

class Area
{
	public static void main(String args[])
	{
		
		Scanner S=new Scanner(System.in);
		System.out.println("Give 2D Objects:");
		int le=S.nextInt();
		int br=S.nextInt();
		Tri t=new Tri();
		Rec r=new Rec();
		t.area(le,br);
		r.area(le,br);
	}
}
