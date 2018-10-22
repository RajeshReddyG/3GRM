//To make frequency count of vowels, consonants, digits, special symbols and words in a given text
class NameFreq
{
	public static void main(String[] args)
	{
		String text="Hello Freinds....!!!This Is R@jesh....***My R.No. Is 15699a0538";
		int cv=0,cs=0,csym=0,cw=0,cd=0;
		for(int i=0;i<text.length();i++)
		{
			char ch=text.charAt(i);
			if(Character.isDigit(ch))
				cd++;
			else if(Character.isLetter(ch))
			{
				if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
					cv++;
				else
					cs++;
			}
			else if(Character.isWhitespace(ch))
				cw++;
			else
				csym++;
		}
		cw=cw+1;

		System.out.println("No. of vowels="+cv);
		System.out.println("No. of consonants="+cs);
		System.out.println("No. of digits="+cd);
		System.out.println("No.of words="+cw);
		System.out.println("No.of special symbols="+csym);
	}
}
