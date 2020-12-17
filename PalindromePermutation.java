package easy;

/**
 * LeetCode Easy
 * 
 * Id : 266  Palindrome Permutation 
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class PalindromePermutation {
	public boolean canPermutePalindrome(String s) {
		int[] frequencyArray = new int[128];

		for (char ch : s.toCharArray()) {
			frequencyArray[ch]++;
		}

		if (s.length() % 2 == 0) {
			for (int frequency : frequencyArray) {
				if (frequency % 2 != 0) {
					return false;
				}
			}
		}

		else {
			int odd = 0;
			for (int frequency : frequencyArray) {
				if (frequency % 2 != 0) {
					odd++;
				}
			}
			if (odd != 1) {
				return false;
			}
		}
		return true;
	}
}
