package easy;

/**
 * LeetCode Easy
 * Id : 167. Two Sum II - Input array is sorted
 * 
 * @author Kundan
 *
 */
public class TwoSum2 {
	/*
	 * Time complexity --> O(log(n))
	 * Space complexity --> O(1)
	 */
	public int[] twoSum(int[] numbers, int target) {
		// Store the result index in this array
		int[] answer = new int[2];
		
		// Declare and Initialize Two pointers 
		int start = 0;
		int end = numbers.length - 1;

		//Binary Search Algorithm
		while (start < end) {
			if (numbers[start] + numbers[end] == target) {
				// Output is following 1-based indexing
				answer[0] = start + 1;
				answer[1] = end + 1;
				break;
			} else if (numbers[start] + numbers[end] < target) {
				start++;
			} else {
				end--;
			}
		}

		// Return the results
		return answer;
	}
}
