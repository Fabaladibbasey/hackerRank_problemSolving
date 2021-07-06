package problemSolving;

import java.util.ArrayList;
import java.util.List;

//the problem: https://www.hackerrank.com/challenges/between-two-sets/problem
public class BetweenTwoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(2);
		arr1.add(4);
		List<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(16);
		arr2.add(32);
		arr2.add(96);
		System.out.println(getTotalX(arr1, arr2));
	}

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    	int totalX = 0;
    	for (int fac = 1; fac < 101; fac++) {
    		boolean facI = true;
    		for(int i = 0; i < a.size(); i++) {
    			if(fac % a.get(i) != 0) {
    				 facI = false; 
    				 break;
    			}
    		}
    		boolean facJ = true;
    		for(int j = 0; j < b.size(); j++) {
    			if(b.get(j) % fac != 0) {
    				facJ = false; 
    				break;
    			}
    		}
    		
    		if(facI && facJ) {
//    			System.out.println(fac);
    			totalX++;
    		}
    	}
    	return totalX;
    }

}
