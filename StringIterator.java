package easy;

/**
 * LeetCode Easy
 * 
 * Id : Design Compressed String Iterator
 * 
 * Time Complexity : O(1)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class StringIterator {

	private int index;
	private int count;
	private char letter;
	private String compressedStr;

	public StringIterator(String compressedString) {
        compressedStr = compressedString;
    }

	public char next() {
		if (count == 0) {
			if (index >= compressedStr.length()) {
				return ' ';
			}

			letter = compressedStr.charAt(index++);

			while (index < compressedStr.length() && Character.isDigit(compressedStr.charAt(index))) {
				count = 10 * count + compressedStr.charAt(index) - '0';
				index++;
			}
		}
		count--;
		return letter;
	}

	public boolean hasNext() {
		return index < compressedStr.length() || count != 0;
	}
}
