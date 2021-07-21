package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MigratoryBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list = {4, 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(list));
		System.out.println(migratoryBirds(arr));
	}

	public static int migratoryBirds(List<Integer> arr) {
	    // Write your code here
		
		Map<Integer, Integer> birds = new HashMap<Integer, Integer>();
		for(Integer el : arr) {
			if(!birds.containsKey(el)) {
				birds.put(el, 1);
			}else {
				birds.put(el, birds.get(el) + 1);
			}
		}
		
		Entry<Integer, Integer> entry = birds.entrySet().iterator().next();
		Integer value = entry.getValue();
		Integer key = entry.getKey();
		System.out.println(birds.entrySet());
		for (Entry<Integer, Integer> el : birds.entrySet()) {
			if(value < el.getValue()) {
				value = el.getValue();
				key = el.getKey();
			}else if(value == el.getValue() && el.getKey() < key) {
				key = el.getKey();
			}
		}
		return key;
	    }
}
