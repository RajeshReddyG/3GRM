import java.util.Scanner;
class ravi
{
	public static void main(String Ravi[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Give 5 Digit Number:");
		int pn=S.nextInt();
		double factn=1;double factr=1;
		for(int i=pn;i>0;i--)
			factn=factn*i;
		//for(int j=pn-1;j>0;j--)
			//factr=factr*j;
		
		System.out.println("Permutations Of "+pn+"Are:");
		System.out.println(factn);
		
	}
}
		
