package easy;

/**
 * LeetCode Easy
 * 
 * Id : 896		Montonic Array
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * 
 * 
 * @author Kundan
 *
 */
public class MonotonicArray {
	public boolean isMonotonic(int[] A) {
		boolean monotonically_increasing = true;
		boolean monotonically_decreasing = true;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i + 1]) {
				monotonically_increasing = false;
			}
			if (A[i] < A[i + 1]) {
				monotonically_decreasing = false;
			}
		}

		return monotonically_increasing || monotonically_decreasing;
	}
}
