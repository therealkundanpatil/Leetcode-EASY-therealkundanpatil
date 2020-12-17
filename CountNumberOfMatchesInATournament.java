package easy;

/**
 * LeetCode Easy :
 * 
 * Id: 1688		Count Number Of Matches In a tournament
 * 
 * Time Complexity : O(logn);
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class CountNumberOfMatchesInATournament {
    public int numberOfMatches(int n) {
        int totalMatches = 0;
        
        while(n != 1){
            if( n % 2 == 0 ){
                totalMatches += n/2;
                n = n/2;
            }
            else{
                totalMatches += ( n - 1 ) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return totalMatches;
    }
}
