package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Easy
 * 
 * Id:  Consistent Strings
 * 
 * Time Complexity : O(n2)
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class ConsistentStrings {
	public int countConsistentStrings(String allowed, String[] words) {
		Set<Character> uniqueCharactersAllowed = new HashSet<>();

		for (char ch : allowed.toCharArray()) {
			if (!uniqueCharactersAllowed.contains(ch)) {
				uniqueCharactersAllowed.add(ch);
			}
		}
		int consistentStrings = 0;

		for (String word : words) {
			boolean satisfies = true;
			for (char ch : word.toCharArray()) {
				if (!uniqueCharactersAllowed.contains(ch)) {
					satisfies = false;
					break;
				}
			}
			if (satisfies) {
				consistentStrings++;
			}
		}

		return consistentStrings;
	}
}
