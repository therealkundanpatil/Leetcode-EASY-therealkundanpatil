package easy;

/**
 * LeetCode Easy
 * 
 * Id : 496		Next Greater Element 1
 * 
 * Brute Force Approach
 * 
 * @author Kundan
 *
 */
public class NextGreaterElementOne {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		for (int i = 0; i < nums1.length; i++) {
			boolean foundHigh = false;
			int index = performSearching(nums2, nums1[i]);
			for (int j = index; j < nums2.length; j++) {
				if (nums1[i] < nums2[j]) {
					foundHigh = true;
					nums1[i] = nums2[j];
					break;
				}
			}
			if (!foundHigh) {
				nums1[i] = -1;
			}
		}

		return nums1;
	}

	public static int performSearching(int[] a, int target) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
