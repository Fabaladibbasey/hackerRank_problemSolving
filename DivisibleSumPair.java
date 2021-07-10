package problemSolving;

import java.util.ArrayList;
import java.util.List;

//Question: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
public class DivisibleSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1, 3, 2, 6, 1, 2 };
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(6);
		arr.add(1);
		arr.add(2);
		System.out.println(divisibleSumPairs(6, 3, arr));
	}

	 public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		    // Write your code here
		 int divisibleSumCount = 0;
		 int i = 0;
		 while (i < ar.size()) {
			 for (int j = i + 1; j < ar.size(); j++) {
				 if((ar.get(i) + ar.get(j)) % k == 0) {
					 divisibleSumCount++;
				 }
			 }
			 i++;
		 }
		 return divisibleSumCount;
		    }
}
