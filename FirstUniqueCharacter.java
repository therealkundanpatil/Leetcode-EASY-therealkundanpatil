package easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
	public static int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<>();

		int length = s.length();

		// HashMap that stores the frequency of characters
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);

			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Iterate over the string and get the frequency of current character. If it is
		// 1, then return that index value
		for (int i = 0; i < length; i++) {
			if (map.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}

}
