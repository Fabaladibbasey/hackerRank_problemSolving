package problemSolving;

import java.util.ArrayList;
import java.util.List;

//Question: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class BreakingRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();
		//3 4 21 36 10 28 35 5 24 42
		li.add(3);
		li.add(4);
		li.add(21);
		li.add(36);
		li.add(10);
		li.add(28);
		li.add(35);
		li.add(5);
		li.add(24);
		li.add(42);
		
		System.out.println(breakingRecords(li));
		
	}

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    	int minScore = scores.get(0);
    	int maxScore = scores.get(0);
    	int minCount = 0;
    	int maxCount = 0;
    	List<Integer> breakRecordsCount = new ArrayList<Integer>();
    	
    	for (int i = 0; i < scores.size(); i++) {
    		int score = scores.get(i);
    		if (score < minScore) {
    			minScore = score;
    			minCount++;
    		}
    		if (score > maxScore) {
    			maxScore = score;
    			maxCount++;
    		}
    	}
    	
    	breakRecordsCount.add(maxCount);
    	breakRecordsCount.add(minCount);
    	return breakRecordsCount;

    }
}
