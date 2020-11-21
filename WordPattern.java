package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode Easy 
 * 
 * Id : 290 	Word Pattern
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * 
 * 
 * @author Kundan
 *
 */
public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		//Ensure Unique Mapping Therefore using HashMap and HashSet Combination
		Map<Character, String> map = new HashMap<>();
		Set<String> visited = new HashSet<>();
		String[] words = s.split(" ");

		if (pattern.length() != words.length) {
			return false;
		}

		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			if (map.containsKey(ch)) {
				if (!map.get(ch).equals(words[i])) {
					return false;
				}
			} else {
				if (visited.contains(words[i])) {
					return false;
				} else {
					map.put(ch, words[i]);
					visited.add(words[i]);
				}

			}
		}

		return true;

	}
}
