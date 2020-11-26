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
		//Convert Integer to binary string format
		String numberString = Integer.toBinaryString(n);

		// if any two consecutive bits are same then return false,else true 
		for (int i = 0; i < numberString.length() - 1; i++) {
			if (numberString.charAt(i) == numberString.charAt(i + 1)) {
				return false;
			}
		}

		return true;
	}
}
