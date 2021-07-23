package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/magic-square-forming/problem

public class MagicSquare {

	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		//4 9 2
		//3 5 7
		//8 1 5
		Integer[] arr1 = {3, 9, 2}; 
		List<Integer> arr1List = new ArrayList<Integer>(Arrays.asList(arr1));
		matrix.add(arr1List);
		Integer[] arr2 = {3, 5, 7}; 
		List<Integer> arr2List = new ArrayList<Integer>(Arrays.asList(arr2));
		matrix.add(arr2List);
		Integer[] arr3 = {8, 1, 5}; 
		List<Integer> arr3List = new ArrayList<Integer>(Arrays.asList(arr3));
		matrix.add(arr3List);
		System.out.println(matrix);
		System.out.println(formingMagicSquare(matrix));
	}

    public static int formingMagicSquare(List<List<Integer>> s) {
    // Write your code here
    	int cost = 0;
    	if(s.get(1).get(1) != 5) {
    		cost += (s.get(1).get(1) - 5);
    		s.get(1).set(1, 5);
    	}
    	for (int i = 2; i < 9; i += 2) {
    		if((s.get(0).get(0) % 2 != 0) && (s.get(0).get(2) != i && s.get(2).get(0) != i && s.get(2).get(2) != i)) {
    			cost += (s.get(0).get(0) - i);
    			s.get(0).set(0, i);
    		}
    		if((s.get(0).get(2) % 2 != 0) && (s.get(0).get(0) != i && s.get(2).get(0) != i && s.get(2).get(2) != i)) {
    			cost += (s.get(0).get(2) - i);
    			s.get(0).set(2, i);
    		}
    		if((s.get(2).get(0) % 2 != 0) && (s.get(0).get(0) != i && s.get(0).get(2) != i && s.get(2).get(2) != i)) {
    			cost += (s.get(2).get(0) - i);
    			s.get(2).set(0, i);
    		}
    		if((s.get(2).get(2) % 2 != 0) && (s.get(0).get(0) != i && s.get(0).get(2) != i && s.get(2).get(0) != i)) {
    			cost += (s.get(2).get(2) - i);
    			s.get(2).set(2, i);
    		}
    	}
    	System.out.println(s);
    	return cost;
    }
}
