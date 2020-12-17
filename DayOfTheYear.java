package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Easy
 * 
 * Id:		Day of The Year
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class DayOfTheYear {
	public int dayOfYear(String date) {
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 0);
		map.put(1, 31);
		map.put(2, 28);
		map.put(3, 31);
		map.put(4, 30);
		map.put(5, 31);
		map.put(6, 30);
		map.put(7, 31);
		map.put(8, 31);
		map.put(9, 30);
		map.put(10, 31);
		map.put(11, 30);
		map.put(12, 31);

		int totalDays = 0;
		boolean isFebruaryUsed = false;
		for (int i = 0; i < month; i++) {
			if (i == 2) {
				isFebruaryUsed = true;
			}

			totalDays += map.get(i);
		}

		totalDays += day;

		if (isFebruaryUsed) {
			if (year % 4 == 0 && year % 100 != 0) {
				totalDays += 1;
			}
		}

		return totalDays;
	}
}
