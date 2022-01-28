package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String str = "Madam",revstring = "",temp;
		temp = str.toLowerCase();
		System.out.println(temp);
		char[] s = str.toCharArray();
		int len=str.length();
		for (int i = len-1; i>=0; i--) {
			
			revstring = revstring + s[i];
		}
		if(temp.equals(revstring.toLowerCase()))
		{
			System.out.println("Palindrome");
		}
			
		else
		{ System.out.println("Not a palindrome");
	}

}
}