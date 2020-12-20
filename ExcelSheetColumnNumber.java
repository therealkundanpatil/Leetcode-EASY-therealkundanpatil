package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Easy
 * 
 * Id: 171          Excel Sheet Column Number
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 *  
 * @author Kundan
 *
 */
public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		if (s.isEmpty() || s == null) {
			return 0;
		}
		Map<Character, Integer> map = new HashMap<>();
		int value = 0;
		for (int i = 0; i < 26; i++) {
			char ch = (char) (i + 65);
			if (!map.containsKey(ch)) {
				map.put(ch, ++value);
			}
		}

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = (result * 26 + map.get(s.charAt(i)));
			System.out.println(result);
		}

		return result;

	}
}
