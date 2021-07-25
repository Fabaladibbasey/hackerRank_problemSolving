package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/magic-square-forming/problem

public class MagicSquare {

	public static void main(String[] args) {
		//4 9 2
		//3 5 7
		//8 1 5
		Integer[][] arr = { {4, 9, 2}, {3, 5, 7}, {8, 1, 5} }; 
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		for (Integer[] list : arr) {
			matrix.add(Arrays.asList(list));
		}
		System.out.println(matrix);
		System.out.println(formingMagicSquare(matrix));
	}

    public static int formingMagicSquare(List<List<Integer>> s) {
    // Write your code here
    	Integer[][][] pC = {
    			
    		   {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
               {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
               {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
               {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
               {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
               {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, 
               {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
               {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
    	};
    	int cost = 1000000; //initial cost set to high cost, infinity if possible
    	for (int i = 0; i < pC.length; i++) {
    		List<List<Integer>> newlist = new ArrayList<List<Integer>>(s);
    		int newCost = 0;
    		for (int j = 0; j < pC[i].length; j++) {
    			for (int k = 0; k < pC[i][j].length; k++) {
    				if(newlist.get(j).get(k) != pC[i][j][k]) {
    					newCost += Math.abs((newlist.get(j).get(k) -  pC[i][j][k]));
    				}
    			}
    		}
    		if (newCost < cost) {
    			cost = newCost;
    		}
    	}
    	
    	return cost;
    }
}
