package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode Easy 
 * 
 * Id:  		Intersection of Two Arrays
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * 
 * 
 * @author Kundan
 *
 */
public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			if (!set1.contains(nums1[i])) {
				set1.add(nums1[i]);
			}
		}

		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < nums2.length; i++) {
			if (!set2.contains(nums2[i])) {
				set2.add(nums2[i]);
			}
		}

		List<Integer> commanElements = new ArrayList<>();
		for (Integer num : set1) {
			if (set2.contains(num)) {
				commanElements.add(num);
			}
		}

		int[] toReturn = new int[commanElements.size()];
		for (int i = 0; i < toReturn.length; i++) {
			toReturn[i] = commanElements.get(i);
		}

		return toReturn;
	}
}
