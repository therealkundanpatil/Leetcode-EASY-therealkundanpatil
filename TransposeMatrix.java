package easy;

/**
 * LeetCode Easy 
 * 
 * Id : 867		Transpose Matrix
 * 
 * Time Complexity : O(n2)
 * Space Complexity : O(n2)
 * 
 * @author Kundan
 *
 */
public class TransposeMatrix {
	public int[][] transpose(int[][] A) {
		int[][] result = new int[A[0].length][A.length];
		int rowIndex = -1;
		int columnIndex = -1;
		for (int i = 0; i < A.length; i++) {
			++columnIndex;
			for (int j = 0; j < A[i].length; j++) {
				result[++rowIndex][columnIndex] = A[i][j];
			}
			rowIndex = -1;
		}

		return result;
	}
}
