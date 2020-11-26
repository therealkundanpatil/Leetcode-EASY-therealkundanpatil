package easy;

/**
 * LeetCode Easy
 * 
 * Id : 	Shuffle the Array
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int resultIndex = -1;
        for( int i = 0; i < n; i++ ){
            result[ ++resultIndex ] = nums[ i ];
            result[ ++resultIndex ] = nums[ i + n ];    
        }
        
        return result;
    }
}
