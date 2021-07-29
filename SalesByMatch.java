package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//https://www.hackerrank.com/challenges/sock-merchant/problem
public class SalesByMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		List<Integer> arList = new ArrayList<Integer>(Arrays.asList(ar));
		System.out.println(sockMerchant(arList.size(), arList));
	}


    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    	int matchCount = 0;
    	Collections.sort(ar);
    	System.out.println(ar);
    	Stack<Integer> stack = new Stack<Integer>();
    	for (int i = 0; i < n; i++) {
    		int currentEl = ar.get(i);
    		if(stack.contains(currentEl)) {
    			matchCount++;
    			stack.pop();
    		}else {
    			stack.add(currentEl);
    		}
    		System.out.println(stack);
    	}
    	
    	
    	return matchCount;

    }
}
