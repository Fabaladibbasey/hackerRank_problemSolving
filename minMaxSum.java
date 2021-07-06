package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Question: https://www.hackerrank.com/challenges/mini-max-sum/problem
public class minMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrs = {396285104, 573261094, 759641832, 819230764, 364801279};
		miniMaxSum(arrs);
	}	

	static void miniMaxSum(int[] arr) {
        List<Long> minMaxElements = new ArrayList<>();
        List<Long> inputArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
        	inputArr.add((long) arr[i]);
        }
      
        for(int j = 0; j < inputArr.size(); j++){
        	long ex = inputArr.get(j);
        	inputArr.remove(ex);
        	
        	long sum = 0;
        	int i = 0;
            while(i < inputArr.size()){
            	sum += inputArr.get(i);
                i++;
        }
            inputArr.add(j, ex);
            minMaxElements.add(sum);
            
        }
        long miniSum = minMaxElements.get(0);
        long maxSum = minMaxElements.get(0);
        
        for(int m = 0; m < minMaxElements.size(); m++) {
        	if (minMaxElements.get(m) < miniSum) miniSum = minMaxElements.get(m);
        	if(minMaxElements.get(m) > maxSum) maxSum = minMaxElements.get(m);
        }
        
        System.out.println(miniSum + " "+ maxSum);
    }
	
}
