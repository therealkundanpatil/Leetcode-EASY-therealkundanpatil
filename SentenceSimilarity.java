package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode Easy
 * 
 * Id:  Sentence Similarity
 * 
 * Time Complexity : O(n)
 * 
 * Space COmplexity :O(n)
 * @author Kundan
 *
 */
public class SentenceSimilarity {
	public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
		if (sentence1.length != sentence2.length) {
			return false;
		}

		int length = sentence1.length;

		Map<String, Set<String>> map = new HashMap<>();

		for (int i = 0; i < similarPairs.size(); i++) {
			String s1 = similarPairs.get(i).get(0);
			String s2 = similarPairs.get(i).get(1);
			if (!map.containsKey(s1)) {
				map.put(s1, new HashSet<>());
			}
			map.get(s1).add(s2);
		}

		for (int i = 0; i < length; i++) {
			String s1 = sentence1[i];
			String s2 = sentence2[i];
			if (s1.equals(s2)) {
				continue;
			} else if ((map.containsKey(s1) && map.get(s1).contains(s2))
					|| (map.containsKey(s2) && map.get(s2).contains(s1))) {
				continue;
			} else {
				return false;
			}
		}

		return true;
	}
}
