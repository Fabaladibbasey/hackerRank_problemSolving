package problemSolving;

import java.math.BigInteger;

//https://www.hackerrank.com/challenges/extra-long-factorials/problem
public class ExtraLongFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extraLongFactorials(4);

	}

	 public static void extraLongFactorials(int n) {
		    // Write your code here
		 System.out.println(factorial(n));
		 return;

		    }
	 public static BigInteger factorial(int n) {
		 BigInteger b = BigInteger.valueOf(n);
		 if (n < 2) {
			 return b;
		 }
		 return b.multiply(factorial(b.intValue() - 1));
	 }
}
