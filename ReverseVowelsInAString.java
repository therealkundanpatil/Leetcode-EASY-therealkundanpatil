package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseVowelsInAString {
	public String reverseVowels(String s) {
		if (s.length() <= 1) {
			return s;
		} else {
			List<Character> vowelList = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
			Set<Character> vowelSet = new HashSet<Character>(vowelList);

			char[] stringArray = s.toCharArray();

			for (int i = 0, j = stringArray.length - 1; i <= j;) {
				if (!vowelSet.contains(stringArray[i])) {
					i++;
					continue;
				}
				if (!vowelSet.contains(stringArray[j])) {
					j--;
					continue;
				}
				if (vowelSet.contains(stringArray[i]) && vowelSet.contains(stringArray[j])) {
					char temp = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] = temp;
					i++;
					j--;
				}
			}

			return new String(stringArray);
		}
	}
}
