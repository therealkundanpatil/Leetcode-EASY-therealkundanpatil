package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Easy
 * 
 * Id : 819			Most Common Words
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {

		paragraph = paragraph.replaceAll("\\W+", " ");
		paragraph = paragraph.toLowerCase();

		String[] paragraphContent = paragraph.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String word : paragraphContent) {
			if (!map.containsKey(word)) {
				map.put(word, 1);
			} else {
				map.put(word, map.get(word) + 1);
			}
		}

		String commonWord = "";
		int maxCount = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			boolean wordBanned = false;
			String searchThisWord = entry.getKey();
			for (int i = 0; i < banned.length; i++) {
				if (banned[i].equals(searchThisWord)) {
					wordBanned = true;
					break;
				}
			}
			if (!wordBanned) {
				int count = entry.getValue();
				if (count > maxCount) {
					maxCount = count;
					commonWord = searchThisWord;
				}
			}
		}

		return commonWord;
	}
}
