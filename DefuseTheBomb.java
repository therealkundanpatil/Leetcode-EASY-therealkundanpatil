package easy;

import java.util.Arrays;

public class DefuseTheBomb {

	public static int[] decrypt(int[] code, int k) {
		int length = code.length;
		int[] decryptedCode = new int[length];
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (k > 0) {
				while (count < k) {
					decryptedCode[i] += code[(i + (count + 1)) % length];
					count++;
				}
				count = 0;
			} else if (k < 0) {
				int tempK = -k;
				while (count < tempK) {
					int index = i - (count + 1);
					decryptedCode[i] += code[(index + length) % length];
					count++;
				}
				count = 0;
			} else {
				decryptedCode[i] = 0;
			}
		}

		return decryptedCode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] code = { 5, 7, 1, 4};
		int k = 3;
		System.out.println(Arrays.toString(decrypt(code, k)));
	}

}
