package easy;

public class FindKthPositive {
	public static int findKthPositive(int[] arr, int k) {
		int answer = 0;
		int index = 0;
		int missingCount = 0;
		boolean found = false;
		for (int number = 1; number <= 1000; number++) {
			if (number != arr[index]) {
				missingCount++;
				if (missingCount == k) {
					found = true;
					answer = number;
				}
			} else {
				if (index < arr.length - 1) {
					index++;
				}
			}
		}

		if (found) {
			return answer;
		} else {
			return 1000 + (k - missingCount);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 7, 11 };
		int k = 5;
		System.out.println(findKthPositive(arr, k));
	}

}
