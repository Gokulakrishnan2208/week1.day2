package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String txt1 = "gokul";
		String txt2 = "oklug";
		if (txt1.length() == txt2.length()) {
			char[] text1 = txt1.toCharArray();
			char[] text2 = txt2.toCharArray();
			Arrays.sort(text1);
			Arrays.sort(text2);
			for (int i = 0; i < text2.length; i++) {

				if (text1[i] == (text2[i])) {
					System.out.println(text1[i]);
				} else {
					System.out.println("Letters are not equal");
					i = text2.length;
				}
			}
		} else
			System.out.println("Length not equal");
	}

}
