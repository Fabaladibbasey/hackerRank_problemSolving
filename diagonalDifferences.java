package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Question: https://www.hackerrank.com/challenges/diagonal-difference/problem
public class diagonalDifferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result re = new Result();
		List<List<Integer>> dList = new ArrayList<List<Integer>>();
		dList.add(new ArrayList<Integer>(Arrays.asList(7, 2, 4, 9)));
		dList.add(new ArrayList<Integer>(Arrays.asList(2, 0, 9, 3)));
		dList.add(new ArrayList<Integer>(Arrays.asList(5, 3, 6, 1)));
		dList.add(new ArrayList<Integer>(Arrays.asList(5, 3, 6, 1)));

		
		int show = re.diagonalDifference(dList);
		System.out.println(show);
		

	}
}
	
	
	class Result {

	    /*
	     * Complete the 'diagonalDifference' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	     */

	    public int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
	    int i = 0;
	    int firstDiagonal = 0;
	    int secondDiagonal = 0;
	    int size = arr.size();
	    int fIterateRate = 0;
	    int sIterateRate = size - 1;
	
	    while (i < size) {
	       
	        firstDiagonal += arr.get(i).get(fIterateRate);
	        fIterateRate++;
	        
	        secondDiagonal += arr.get(i).get(sIterateRate);
	        sIterateRate--;
	        
	        i++;
	    }
	    
	    int result = Math.abs(firstDiagonal - secondDiagonal);
	    return result;
	    }

	}

