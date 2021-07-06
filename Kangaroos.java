//visit the problem at https://www.hackerrank.com/challenges/kangaroo/problem

package problemSolving;

public class Kangaroos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kangaroo(2081, 8403, 9107, 8400));
	}

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    	for (int i = 0; i < 9001; i++) {
    		x1 += v1;
    		x2 += v2;
    		if (x1 == x2) {
//    			System.out.println(i); 
    			return "YES";
    		}
    	}
    	return "NO";
    	/*
    	 * you can also use the mathematics formula
    	 * (y * v1) + x1 = (y * v2) + x2
    	 * 
    	 */
    }
  
}
