package easy;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {
	public static int countCharacters(String[] words, String chars) {

		int result = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < chars.length(); i++) {
			map.put(chars.charAt(i), map.getOrDefault(chars.charAt(i), 0) + 1);
		}

		for (String word : words) {

			boolean can_be_formed = false;
			int[] count = new int[26];

			for (char ch : word.toCharArray()) {
				count[ch - 'a'] += 1;
			}

			for (char ch : word.toCharArray()) {
				if (!map.containsKey(ch) || map.get(ch) < count[ch - 'a']) {
					can_be_formed = false;
					break;
				} else {
					can_be_formed = true;
				}
			}
			if (can_be_formed) {
				result += word.length();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "cat", "bt", "hat", "tree" };
		String chars = "atach";
		System.out.println(countCharacters(words, chars));
	}

}
