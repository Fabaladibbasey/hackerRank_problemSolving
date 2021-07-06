package problemSolving;

import java.util.Scanner;

//Question: https://www.hackerrank.com/challenges/staircase/problem
public class StairCase {

	public static void main(String[] args) {		
		staircase(7);
	}
	
	static void staircase(int n) {
		int spRate = n;
		for (int i = 0; i < n; i++) {
			String string = "";
			String space = "";
			
			for (int j = 0; j < i; j++) {
				string += "#";
			}
//			System.out.println(string);
			int k = spRate;
			while (k > 0) {
				space += " ";
				k--;
			}
			spRate--;
			space += string;
			
			System.out.print(space);
			System.out.println();
		}
		
		
}
}
