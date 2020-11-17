package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Easy Id : 1
 * 
 * 
 * @author Kundan
 *
 */
public class TwoSum {
	/*
	 * Brute Force approach involves the use of 2 for loops. However, as data size
	 * increases the algorithm performs poorly. Below presented is the fairly good
	 * solution
	 * 
	 * Time complexity = O(n); Space complexity = O(n);
	 */

	public int[] twoSum(int[] nums, int target) {
		// Create an array to store the results
		int[] answer = new int[2];

		// HashMap to Store each element and its corresponding index
		Map<Integer, Integer> map = new HashMap<>();

		// Single Pass
		for (int i = 0; i < nums.length; i++) {

			// Look for remainder in the map
			int remainder = target - nums[i];

			// If present obtain its index and current element index and store it in result
			if (map.containsKey(remainder)) {
				answer[0] = map.get(remainder);
				answer[1] = i;
				break;
			}
			// Else put an entry into map
			else {
				map.put(nums[i], i);
			}
		}

		// Return the answer
		return answer;
	}

}
