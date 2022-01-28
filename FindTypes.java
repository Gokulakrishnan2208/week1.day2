package week1.day2;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$";
		int letter=0,space=0,num=0,specchar=0;
		char[] s = test.toCharArray();
		for (int i = 0; i < s.length; i++) {
			
			if (Character.isLetter(s[i])) {
				letter=letter+1;
				
			}
			else if (Character.isSpaceChar(s[i])) {
				space=space+1;
			}
			else if (Character.isDigit(s[i])) {
				num=num+1;
			}
				else {
				specchar=specchar+1;
			
		}
		}
	
				
				System.out.println(letter);
				System.out.println(space);
				System.out.println(num);
				System.out.println(specchar);
	}
	
}


