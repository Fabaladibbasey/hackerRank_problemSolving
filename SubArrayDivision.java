package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Question: https://www.hackerrank.com/challenges/the-birthday-bar/problem
public class SubArrayDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		//1 2 1 3 2
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println(birthday(list, 3, 2));
	}
	

    public static int birthday(List<Integer> s, int d, int m) {
    	
//    	 // Write your code here
//my prefered code but the time exceed in testing 
//        int segmentCount = 0;
//        int sum = 0;
//        int consecutive = 1;
//        for (int i = 0; i < s.size() - m; i++) {
//            sum += s.get(i);
//            if(consecutive == m) {
//                if(sum == d) {
//                    segmentCount++;
//                }
//                i -= 1;
//                consecutive = 0;
//                sum = 0;
//            }
//            consecutive++;
//        }
//        
//        return segmentCount;
    	
    // Write your code here
    	int segmentCount = 0;
    	for (int i = 0; i <= s.size() - m; i++) {
    		int sum = 0;
    		int index = i;
    		for(int j = 0; j < m; j++) {
    			sum += s.get(index);
    			index++;
    		}
    		if(sum == d) {
    			segmentCount++;
    		}
    	}
    	
    	return segmentCount;

    }

}
