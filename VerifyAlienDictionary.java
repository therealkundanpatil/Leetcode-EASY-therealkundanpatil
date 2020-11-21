package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Easy
 * 
 * Id : 953 Verifying Alien Dictionary
 * TimeComplexity = O(n2)
 * SpaceComplexity = O(1)
 * 
 * @author Kundan
 *
 */
public class VerifyAlienDictionary {
	public boolean isAlienSorted(String[] words, String order) {

		boolean isLess = false;
		//HashMap to store order of alphabet
		Map<Character, Integer> orderMap = new HashMap<>();

		for (int i = 0; i < order.length(); i++) {
			orderMap.put(order.charAt(i), i);
		}
		
		//Check two consecutive words
		for (int i = 0, j = i + 1; i < words.length - 1; i++, j++) {
			String word1 = words[i];
			String word2 = words[j];
			
			//Obtain Smaller of the two length
			int minLength = (word1.length() > word2.length()) ? word2.length() : word1.length();
			//Check for each character 
			for (int k = 0; k < minLength; k++) {
				if (orderMap.get(word1.charAt(k)) < orderMap.get(word2.charAt(k))) {
					isLess = true;
					break;
				} else if (orderMap.get(word1.charAt(k)) > orderMap.get(word2.charAt(k))) {
					return false;
				}
			}
			if (!isLess && word1.length() > word2.length()) {
				return false;
			}
		}
		return true;
	}
}
