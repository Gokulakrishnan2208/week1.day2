package week1.day2;

public class PrimeNumber {
public static void main(String[] args) {
	int j = 11,remainder;
	boolean t = false;
	for (int i = 2; i <= j/2; i++) {
		remainder = j%i;
		if(remainder==0)
		{
			t = true;
			i=j/2;
		}
		
		}
	 if(t==false) {
		 System.out.println("Its prime number" +j);}
	 else
	 { System.out.println("Its not a prime number" +j);}
	}
}