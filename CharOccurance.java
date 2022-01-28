package week1.day2;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		
		char[] s = str.toCharArray();
		int len =s.length;
		System.out.println(len);
		for (int i = 0; i <len; i++) {
			
			if(s[i]=='e') {
				count = count+1;
			}
			
		}
		System.out.println(count);
	}

}
