package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClimbingLeaderboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//100, 90, 90, 80
		//70, 80, 105
		Integer[] arr = {100, 100, 50, 40, 40, 20, 10 };
		Integer[] playerArr = {5, 25, 50, 120};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> playerList = new ArrayList<Integer>(Arrays.asList(playerArr));
		System.out.println(climbingLeaderboard(list, playerList));
	}

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // player -> Alice
    // rank -> Leaderboard ranking
    	List<Integer> rankTrack = new ArrayList<Integer>();
    	Set<Integer> rankedSet = new HashSet<Integer>(ranked);
    	for (int i = 0; i < player.size(); i++) {
    		rankTrack.add(scoreIndex(rankedSet, player.get(i)) + 1);
    	}
    	return rankTrack;
    }

 public static int scoreIndex(Set<Integer> ranks, int score){
	 List<Integer> scoreInsertedList = new ArrayList<Integer>(ranks);
	 scoreInsertedList.add(score);
	 Collections.sort(scoreInsertedList, Collections.reverseOrder());
	 return indexOf(scoreInsertedList, score);
 
 }
 
 public static int indexOf(List<Integer> list, int value) {
	 //first occurrence using binary search on descending order list
	 int index = -1;
	 int left = 0;
	 int right = list.size() - 1;
	 while (left <= right) {
		 int mid = (left + right) / 2;
		 if(list.get(mid) == value) {
			 return mid;
		 }else if(list.get(mid) < value) {
			 //search left
			 right = mid - 1;
		 }else {
			 //search right
			 left = mid + 1;
		 }
	 }
	 return index;
 }
 
}
