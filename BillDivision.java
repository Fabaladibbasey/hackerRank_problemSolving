package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/bon-appetit/problem
public class BillDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] bill = {3, 10, 2, 9};
		int annaNotEat = 1;
		int brianCharged = 7;
		ArrayList<Integer> billList = new ArrayList<Integer>(Arrays.asList(bill));
		bonAppetit(billList, annaNotEat, brianCharged);
	}

	 public static void bonAppetit(List<Integer> bill, int k, int b) {
		    // Write your code here
		 int totalBill = 0;
		 for (Integer cost : bill) {
			 if (cost == bill.get(k)) continue;
			 totalBill += cost;
		 }
		 
		 if((totalBill / 2) - b == 0) {
			 System.out.println("Bon Appetit");
			 return;
		 }
		 
		 System.out.println(b - (totalBill / 2) );
		    }
}
