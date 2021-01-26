package easy;

/**
 * LeetCode Easy
 * 
 * Id: 383  Ransom Note
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] frequencyCounter = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			frequencyCounter[magazine.charAt(i) - 'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			Character c = ransomNote.charAt(i);
			if (frequencyCounter[c - 'a'] > 0) {
				frequencyCounter[c - 'a']--;
			} else {
				return false;
			}
		}

		return true;
	}
}
