package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode Easy
 * 
 * Id:  Find Common characters
 * 
 * Time Complexity : O(n2)
 * 
 * Space Complexity : O(n)
 * @author Kundan
 *
 */
public class FindCommonCharacters {
	public List<String> commonChars(String[] A) {
		List<String> outputList = new ArrayList<>();
		Map<String, int[]> map = new HashMap<>();

		/*
		 * Create A Map Key ---> Word Value --> Frequency of character in that
		 * particular word
		 */
		for (int i = 0; i < A.length; i++) {
			int[] counterArray = new int[26];
			for (char ch : A[i].toCharArray()) {
				counterArray[ch - 'a']++;
			}

			map.put(A[i], counterArray);
		}

		/*
		 * Create One Master Frequency Array. If character is present in all the words
		 * choose the minimum occuring frequency of that character
		 */
		int[] masterCounterArray = new int[26];
		for (int[] counterArray : map.values()) {
			for (int i = 0; i < 26; i++) {
				if (counterArray[i] == 0) {
					masterCounterArray[i] = -1;
				} else if (masterCounterArray[i] == 0) {
					masterCounterArray[i] = counterArray[i];
				} else {
					masterCounterArray[i] = Math.min(masterCounterArray[i], counterArray[i]);
				}
			}
		}

		/*
		 * Using Master Frequency Array, Add the character to the output list for that
		 * particular frequency
		 */
		for (int i = 0; i < masterCounterArray.length; i++) {
			if (masterCounterArray[i] > 0) {
				int count = masterCounterArray[i];
				char ch = (char) (i + 97);
				while (count != 0) {
					outputList.add(Character.toString(ch));
					count--;
				}
			}

		}
		return outputList;

	}
}
