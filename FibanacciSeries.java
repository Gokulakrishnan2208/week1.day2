package week1.day2;

import java.util.Iterator;

public class FibanacciSeries {
	public static void main(String[] args) {
		int count=8,firnum=0,secnum=1,sum;
		System.out.println(firnum);
			
	for (int i = 1; i < 8; i++) {
			sum = firnum + secnum;
			firnum = secnum;
			secnum =sum;
			System.out.println(sum);
		}
	}

}
