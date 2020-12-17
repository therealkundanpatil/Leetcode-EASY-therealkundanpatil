package easy;

/**
 * LeetCode Easy
 * 
 * ID : 605			Can Place Flowers
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int length = flowerbed.length;
		for (int i = 0; i < length; i++) {
			if (flowerbed[i] == 0) {
				int previousPointer = (i > 0) ? flowerbed[i - 1] : 0;
				int nextPointer = (i < length - 1) ? flowerbed[i + 1] : 0;

				if (n == 0) {
					break;
				}
				
				//Look around the current index if the previous and next both are empty, add plant 
				else if (previousPointer == 0 && nextPointer == 0) {
					flowerbed[i] = 1;
					n--;
				}
			}
		}

		if (n <= 0) {
			return true;
		} else {
			return false;
		}
	}
}
