package easy;

/**
 * LeetCode Easy
 * 
 * Id : 693 	Binary Number with Alternating Bits
 * 
 * Time complexity : O(n)
 * Space complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class BinaryNumberWithAlternatingBits {
	public boolean hasAlternatingBits(int n) {
		String numberString = Integer.toBinaryString(n);

		for (int i = 0; i < numberString.length() - 1; i++) {
			if (numberString.charAt(i) == numberString.charAt(i + 1)) {
				return false;
			}
		}

		return true;
	}
}
