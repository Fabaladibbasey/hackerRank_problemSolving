package problemSolving;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//https://www.hackerrank.com/challenges/day-of-the-programmer/problem
public class DaysOfProgrammers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dayOfProgrammer(1918));
		
	}

    public static String dayOfProgrammer(int year) {
    // Write your code here
    	Map<Integer, Integer> months = new LinkedHashMap<Integer, Integer>();
		months = new LinkedHashMap<>();
		months.put(1, 31); //jan
		months.put(2, 28); //feb
		months.put(3, 31); //mar
		months.put(4, 30); //apr
		months.put(5, 31); //may
		months.put(6, 30); //jun
		months.put(7, 31); //jul
		months.put(8, 31); //aug
		months.put(9, 30); //sep
		months.put(10, 31); //oct
		months.put(11, 30); //nov
		months.put(12, 31); //dec
		
		if((year >= 1700 && year <= 1917) && year % 4 == 0) {
			months.put(2, 29);
		}else if((year >= 1919 && year <= 2700) && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			months.put(2, 29);
		}else if(year == 1918) {
			months.put(2, 15);
		}

		int totalDay = 0;
		int key = 1;
		while ((totalDay + months.get(key)) < 256) {
			totalDay += months.get(key);
			key++;
		}
		
		int day = 256 - totalDay;
		
		String date = twoDigit(Integer.toString(day)) + "." + twoDigit(Integer.toString(key)) + "." + year;
    return date;
    }
    
    static String twoDigit(String str) {
    	while (str.length() < 2) {
    		str = "0" + str;
    	}
    	return str;
    }
}
