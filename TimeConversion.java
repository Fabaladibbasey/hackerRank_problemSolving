package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Question: https://www.hackerrank.com/challenges/time-conversion/problem
public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time = "1:23:43PM";
		System.out.println(timeConversion(time));
	}
	
	static String timeConversion(String s) {
        /*
         * Write your code here.
         */
		String result = "";
		String[] splitedString = s.split(":");
		List<String> splitedCopied = new ArrayList<>();
		for(int i = 0; i < splitedString.length; i++) {
			splitedCopied.add(splitedString[i]);
		}
		int hour = Integer.parseInt(splitedCopied.get(0));
		String minute = splitedCopied.get(1);
		String second = splitedCopied.get(2);
		String finalSecond = "";
		String finalHour = "";
		if (second.contains("PM")) {
			String[] sec = second.split("");
			finalSecond = sec[0] + ""+ sec[1];
			if(hour < 12) {
				hour += 12;
			}
			finalHour = "" + hour;
		}
		else {
			String[] sec = second.split("");
			finalSecond = sec[0] + ""+ sec[1];
			if(hour == 12) {
				finalHour = "00"; 
				return String.format("%s:%s:%s", finalHour, minute, finalSecond);
			}
			else if(hour < 10) {
				finalHour = "0" + hour;
			}
			
		}
	
		result = String.format("%s:%s:%s", finalHour, minute, finalSecond );
		return result;
    }

}
