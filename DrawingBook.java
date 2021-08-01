package problemSolving;

//https://www.hackerrank.com/challenges/drawing-book/problem
public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pageCount(6, 5));
	}

    public static int pageCount(int n, int p) {
    	int page = 1;
    	int leftTurn = 0;
    	while (page < p) {
    		page += 2;
    		leftTurn++;
    	}
    	page = n;
    	if( n % 2 != 0) {
    		page = n - 1;
    	}
    	int rightTurn = 0;
    	while (page > p) {
    		page -= 2;
    		rightTurn++;
    	}
    	return Math.min(leftTurn, rightTurn);

    }

}
