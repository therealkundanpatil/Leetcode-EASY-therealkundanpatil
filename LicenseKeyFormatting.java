package easy;

/**
 * LeetCode Easy 
 * 
 * Id : 482 License Key Formatting
 * Time Complexity = O(n)
 * Space Complexity = O(n)
 * 
 * @author Kundan
 *
 */
public class LicenseKeyFormatting {
	public String licenseKeyFormatting(String S, int K) {
		//Replace all the dash character with literal 
		S = S.replaceAll("-", "");
		//Convert to uppercase
		S = S.toUpperCase();

		char[] ch = S.toCharArray();
		String toReturn = "";
		String helperString = "";
		
		//Read it in reverse order since we need to make group of size K
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == '-') {
				continue;
			} else {
				helperString += ch[i];
			}
		}
		
		//Insert dash appropriately.Last group can have less than K characters 
		char[] helperCh = helperString.toCharArray();
		for (int i = 0; i < helperCh.length; i++) {
			if (((i + 1) % K) == 0) {
				if (i == helperCh.length - 1) {
					toReturn += helperCh[i];
				} else {
					toReturn += "" + helperCh[i] + '-';
				}
			} else {
				toReturn += helperCh[i];
			}
		}

		//Reverse to get the final answer
		char[] toReturnArray = toReturn.toCharArray();

		String answer = "";
		for (int i = toReturnArray.length - 1; i >= 0; i--) {
			answer += toReturnArray[i];
		}

		return answer;
	}
}
