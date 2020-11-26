package easy;

/**
 * LeetCode Easy
 * 
 * Id : 1480 		Running Sum of 1D array
 * @author Kundan
 *
 */
public class RunningSumofArray {
	public int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}
		return nums;
	}
}
