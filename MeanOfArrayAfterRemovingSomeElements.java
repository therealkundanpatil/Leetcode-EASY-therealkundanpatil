package easy;

import java.util.Arrays;

/**
 * LeetCode Easy
 * 
 * Id : 1619	Mean of Array after removing some elements
 * 
 * Time complexity : O(n log(n))
 * Space complexity : O(1)
 * 
 * @author Kundan
 *
 */
class MeanOfArrayAfterRemovingSomeElements {
	public static double trimMean(int[] arr) {
		// Sort in ascending order
		Arrays.sort(arr);
		int dataLength = arr.length;
		// Obtain the index to Remove first 5 percent of the data records from the array
		int removeSmallestTillThisIndex = (int) (0.05 * dataLength);
		// Obtain the index to Remove Last 5 percent of the data records from the array
		int removeLargestAfterThisIndex = (int) (0.95 * dataLength);

		int newLength = (int) (0.90 * dataLength);
		int sum = 0;

		for (int i = removeSmallestTillThisIndex; i < removeLargestAfterThisIndex; i++) {
			sum += arr[i];
		}

		double average = (double) sum / newLength;

		return average;

	}
}
