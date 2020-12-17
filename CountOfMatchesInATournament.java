package easy;

/**
 * LeetCode Easy
 * 
 * Id:	1688	Count of Matches in A Tournament
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class CountOfMatchesInATournament {
	public int numberOfMatches(int n) {
		int teamAdvance = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				teamAdvance += n / 2;
				n /= 2;
			} else {
				teamAdvance += (((n - 1) / 2));
				n = ((n - 1) / 2) + 1;
			}
		}
		return teamAdvance;
	}
}
