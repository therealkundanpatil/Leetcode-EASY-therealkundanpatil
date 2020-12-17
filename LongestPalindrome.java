package easy;

/**
 * LeetCode Easy
 * 
 * Id: 		Longest Palindrome
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class LongestPalindrome {
	public int longestPalindrome(String s) {
		int count = 0;

		if (s.length() < 1) {
			return count;
		}

		// Create an Array of Size 58
		// Why--> ascii of small 'z'--> 123 ,and ascii of 'A' --> 65
		// Thus 123-65 = 58
		int[] array = new int[58];

		for (char ch : s.toCharArray())
			array['z' - ch]++;

		boolean hasOddValue = false;

		// add-values
		for (int frequency : array) {
			if (frequency % 2 == 0)
				count += frequency;
			else {
				count += (frequency - 1);
				hasOddValue = true;
			}
		}

		if (hasOddValue)
			count++;

		return count;
	}
}
