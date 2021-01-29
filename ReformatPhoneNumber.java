package easy;

/**
 * LeetCode Easy
 * 
 * Id: 1694			Reformat Phone Number
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * 
 * @author Kundan
 *
 */
public class ReformatPhoneNumber {
	public String reformatNumber(String number) {
		number = number.replaceAll("\\D+", "");
		StringBuilder reformatPhoneNumber = new StringBuilder("");
		int i = 0;
		while (i + 4 < number.length()) {
			reformatPhoneNumber.append(number.substring(i, i + 3));
			reformatPhoneNumber.append("-");
			i = i + 3;
		}
		if (i + 4 == number.length()) {
			reformatPhoneNumber.append(number.substring(i, i + 2));
			reformatPhoneNumber.append("-");
			reformatPhoneNumber.append(number.substring(i + 2, i + 4));
		} else if (i + 3 == number.length()) {
			reformatPhoneNumber.append(number.substring(i, i + 3));
		} else if (i + 2 == number.length()) {
			reformatPhoneNumber.append(number.substring(i, i + 2));
		} else {

		}
		return reformatPhoneNumber.toString();
	}
}
