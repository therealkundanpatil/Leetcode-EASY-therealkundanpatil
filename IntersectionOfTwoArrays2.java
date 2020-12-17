package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode Easy
 * 
 * Id:  Intersection of Two Arrays 2
 * 
 * Time Complexity : O(n2)
 * 
 * Space Complexity : O(n)
 * @author Kundan
 *
 */
public class IntersectionOfTwoArrays2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();

		for (int i = 0; i < nums1.length; i++) {
			if (!map1.containsKey(nums1[i])) {
				map1.put(nums1[i], 0);
			}
			int count = map1.get(nums1[i]);
			map1.put(nums1[i], ++count);
		}

		for (int i = 0; i < nums2.length; i++) {
			if (!map2.containsKey(nums2[i])) {
				map2.put(nums2[i], 0);
			}
			int count = map2.get(nums2[i]);
			map2.put(nums2[i], ++count);
		}

		List<Integer> commonElementList = new ArrayList<>();

		for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
			int data = entry.getKey();
			int countInFirstMap = entry.getValue();
			if (map2.containsKey(data)) {
				int countInSecondMap = map2.get(data);
				int minimumCount = (countInFirstMap < countInSecondMap) ? countInFirstMap : countInSecondMap;

				while (minimumCount != 0) {
					commonElementList.add(data);
					minimumCount--;
				}
			}
		}

		int[] toReturn = new int[commonElementList.size()];
		for (int i = 0; i < toReturn.length; i++) {
			toReturn[i] = commonElementList.get(i);
		}

		return toReturn;

	}
}
