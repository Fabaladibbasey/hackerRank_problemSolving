package problemSolving;

import java.util.ArrayList;
import java.util.List;

//Question: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class birthDayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(4);
		arrList.add(3);
		arrList.add(2);
		arrList.add(4);

		int result = birthdayCakeCandles(arrList);
		System.out.println(result);
	}
	
	public static int birthdayCakeCandles(List<Integer> candles) {
	    // Write your code here
	        int tallestCandle = candles.get(0);
	        for(int i = 0; i < candles.size(); i++){
	            if(tallestCandle < candles.get(i)) tallestCandle = candles.get(i);
	        }
	        int j = 0;
	        int count = 0;
	        while (j < candles.size()){
	            if(candles.get(j) == tallestCandle) count++;
	            
	            j++;
	        }
			return count;
	    }

}
