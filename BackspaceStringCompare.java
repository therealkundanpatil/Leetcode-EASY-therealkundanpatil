package easy;

import java.util.Stack;

/**
 * LeetCode Easy
 * 
 * Id : 844		Backspace String Compare
 * 
 * Time Complexity : O(n)
 * Space Complexity : O()
 * 
 * @author Kundan
 *
 */
public class BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
		//Stack for First Word
		Stack<Character> word1 = new Stack<>();
		//Stack for Second Word
		Stack<Character> word2 = new Stack<>();

		//Convert the first word to Character Array 
		char[] word1Array = S.toCharArray();
		for (int i = 0; i < word1Array.length; i++) {
			//If # is encountered and Stack is not empty then pop off an (top)element,else continue
			if (word1Array[i] == '#') {
				if (!word1.isEmpty()) {
					word1.pop();
				} else {
					continue;
				}
			} else {
				word1.push(word1Array[i]);
			}
		}
		
		//Same logic for the Second String
		char[] word2Array = T.toCharArray();
		for (int i = 0; i < word2Array.length; i++) {
			if (word2Array[i] == '#') {
				if (!word2.isEmpty()) {
					word2.pop();
				} else {
					continue;
				}
			} else {
				word2.push(word2Array[i]);
			}
		}

		//At this point if the Size of two stacks not same, clearly not equal, return false
		if (word1.size() != word2.size()) {
			return false;
		} else {
			int count = 0;
			int limit = word1.size();
			//Check each character in the stack
			while (count != limit) {
				char ch1 = word1.pop();
				char ch2 = word2.pop();
				if (ch1 != ch2) {
					return false;
				}
				count++;
			}
		}
		return true;
	}
}
