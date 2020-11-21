package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode Easy
 * 
 * Id : 205		Isomorphic Strings
 * 
 * Time complexity : O(n)
 * Space complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		} else {
			// HashMap for mapping
			Map<Character, Character> map = new HashMap<>();
			// Track visited variable to avoid multiple mapping
			Set<Character> visited = new HashSet<>();

			for (int i = 0; i < s.length(); i++) {
				if (!map.containsKey(s.charAt(i)) && !visited.contains(t.charAt(i))) {
					map.put(s.charAt(i), t.charAt(i));
					visited.add(t.charAt(i));
				}
			}

			String transformedString = "";

			for (int i = 0; i < s.length(); i++) {
				transformedString += map.get(s.charAt(i));
			}

			if (transformedString.equals(t)) {
				return true;
			}
			return false;
		}
	}
}
