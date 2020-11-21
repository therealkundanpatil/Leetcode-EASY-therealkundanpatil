package easy;

import java.util.Stack;

/**
 * LeetCode Easy 
 * 
 * Id : 1598		Crawler log folder
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class CrawlerLogFolder {
	public int minOperations(String[] logs) {
		//Stack to store each log operations
		Stack<String> stackObj = new Stack<>();
		for (String log : logs) {
			if (log.equals("../")) {
				if (!stackObj.isEmpty()) {
					stackObj.pop();
				} else {
					continue;
				}
			} else if (log.equals("./")) {
				continue;
			} else {
				stackObj.push(log);
			}
		}

		return stackObj.size();
	}
}
