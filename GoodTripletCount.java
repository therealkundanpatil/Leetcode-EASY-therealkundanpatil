package easy;

/**
 * LeetCode Easy
 * 
 * Id:   Good Triplet Count
 * 
 * Time Complexity : O(n3)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class GoodTripletCount {
	public int countGoodTriplets(int[] arr, int a, int b, int c) {
		int goodTripletCount = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (Math.abs(arr[i] - arr[j]) <= a) {
					for (int k = j + 1; k < arr.length; k++) {
						if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
							goodTripletCount++;
						}
					}
				}
			}
		}

		return goodTripletCount;
	}
}
