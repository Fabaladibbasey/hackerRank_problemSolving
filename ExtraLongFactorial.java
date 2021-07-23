package problemSolving;

import java.math.BigInteger;

//https://www.hackerrank.com/challenges/extra-long-factorials/problem
public class ExtraLongFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		extraLongFactorials(4);
		//converting integer to big integer
		BigInteger big_integer = BigInteger.valueOf(45);
		//converting big integer back to integer
		int integer_value = big_integer.intValue();
		//converting big integer to long
		long long_value = big_integer.longValue();
		
		//converting string to big integer
		BigInteger bigInteger = new BigInteger("1234");
		// big integer back to string
		String string_expression = bigInteger.toString();
		System.out.println(string_expression + "hello!");

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
