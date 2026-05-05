import java.util.Scanner ;

public class a1{

	public static void main (String[]args){


	Scanner sc = new Scanner(System.in);

	System.out.print("enter a line of your choice :");
	String s1 = sc.nextLine();
	s1 = s1.toLowerCase();

	int vowel=0 , space=0 , consonants =0 ;

	for (int i=0; i<s1.length() ; i++ ) 
	{
		char c = s1.charAt(i);

		if (c=='a' || c=='e'  || c=='i' || c=='o' || c=='u') 
		{
			vowel++;
		}
		else if(c==' ')
		{
			space++;
		}
		else{
			consonants++;
		}
	}

	System.out.println("number of vowels :"+vowel);
	System.out.println("number of consonants :"+consonants);
	System.out.println("number of space :"+space);
}
	}