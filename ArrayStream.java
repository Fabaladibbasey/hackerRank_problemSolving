package problemSolving;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"fabala", "mamudo", "lamin"};
		Stream<String> s = Arrays.stream(arr);
		s.forEach(item -> System.out.print(item + " "));
		int[] intArr = {2, 5, 8, 1, 2 };
		IntStream integerAr = Arrays.stream(intArr, 1, 4);
		integerAr.forEach(ar -> System.out.print(ar + " "));
	}

}
