package easy;

/**
 * LeetCode Easy
 * 
 * Id : 1678			Goal Parser Interpretation
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * @author Kundan
 *
 */
public class GoalParserInterpretation {
	public String interpret(String command) {
		char[] commandArray = command.toCharArray();
		StringBuilder outputStringBuilder = new StringBuilder("");
		for (int i = 0; i < commandArray.length; i++) {
			if (commandArray[i] == 'G') {
				outputStringBuilder.append("G");
			} else {
				if (commandArray[i] == '(') {
					if (commandArray[i + 1] == ')') {
						outputStringBuilder.append("o");
						i++;
					} else {
						outputStringBuilder.append("al");
						i += 3;
					}
				}
			}
		}

		return outputStringBuilder.toString();
	}
}
