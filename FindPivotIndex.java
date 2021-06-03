package easy;

public class FindPivotIndex {

	public static int pivotIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int n = nums.length;
			int left = i - 1;
			int right = i + 1;
			int left_sum = 0;
			int right_sum = 0;

			while (left >= 0) {
				left_sum += nums[left];
				left--;
			}

			while (right < n) {
				right_sum += nums[right];
				right++;
			}

			if (left_sum == right_sum) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(nums));
	}

}
