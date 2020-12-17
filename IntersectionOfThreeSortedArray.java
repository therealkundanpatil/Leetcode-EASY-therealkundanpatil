package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode Easy
 * 
 * Id:  Intersection of Three Sorted Array
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * @author Kundan
 *
 */
public class IntersectionOfThreeSortedArray {
	public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
		List<Integer> commonElements = new ArrayList<>();
		int minimumofTwo = (arr1.length < arr2.length) ? arr1.length : arr2.length;
		int minimum = (minimumofTwo < arr3.length) ? minimumofTwo : arr3.length;

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		if (minimum == arr3.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (!set1.contains(arr1[i])) {
					set1.add(arr1[i]);
				}
			}

			for (int i = 0; i < arr2.length; i++) {
				if (!set2.contains(arr2[i])) {
					set2.add(arr2[i]);
				}
			}

			for (Integer num : arr3) {
				if (set1.contains(num) && set2.contains(num)) {
					commonElements.add(num);
				}
			}

		} else if (minimum == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (!set1.contains(arr1[i])) {
					set1.add(arr1[i]);
				}
			}

			for (int i = 0; i < arr3.length; i++) {
				if (!set2.contains(arr3[i])) {
					set2.add(arr3[i]);
				}
			}

			for (Integer num : arr2) {
				if (set1.contains(num) && set2.contains(num)) {
					commonElements.add(num);
				}
			}

		} else {
			for (int i = 0; i < arr2.length; i++) {
				if (!set1.contains(arr2[i])) {
					set1.add(arr2[i]);
				}
			}

			for (int i = 0; i < arr3.length; i++) {
				if (!set2.contains(arr3[i])) {
					set2.add(arr3[i]);
				}
			}

			for (Integer num : arr1) {
				if (set1.contains(num) && set2.contains(num)) {
					commonElements.add(num);
				}
			}

		}

		return commonElements;

	}
}
