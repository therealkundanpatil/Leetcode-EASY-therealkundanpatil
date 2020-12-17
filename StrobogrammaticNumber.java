package easy;

/**
 * LeetCode Easy
 * 
 * Id :  Strobogrammatic Number
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class StrobogrammaticNumber {
	public boolean isStrobogrammatic(String num) {
		char[] numberArray = num.toCharArray();
		char[] mapperArray = { '0', '1', '0', '0', '0', '0', '9', '0', '8', '6' };

		StringBuilder sb = new StringBuilder("");
		for (int i = numberArray.length - 1; i >= 0; i--) {
			sb.append(mapperArray[numberArray[i] - '0']);
		}

		String output = sb.toString();
		if (output.equals(num)) {
			return true;
		} else {
			return false;
		}
	}
}
