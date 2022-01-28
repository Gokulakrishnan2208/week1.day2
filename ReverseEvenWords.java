package week1.day2;

import java.util.Arrays;

public class ReverseEvenWords {
	public static void main(String[] args) {

		String str = "I ma a erawtfos tester";
		String reverse = "";
		String[] rev = str.split(" ");

		for (int i = 0; i < rev.length; i++) {
			if (i % 2 != 0) {
				char[] rev1 = rev[i].toCharArray();

				for (int j = rev1.length - 1; j >= 0; j--) {

					System.out.print(rev1[j]);

				}
			} else {
				System.out.print(" " + rev[i] + " ");
			}
		}

	}

}
