package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Easy
 * 
 * Id :1431 	Kids With Greatest Candies
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * @author Kundan
 *
 */
public class KidsWithGreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Integer.MIN_VALUE;
        for( int i = 0; i < candies.length; i++ ){
            if( candies[ i ] > maxCandies ){
                maxCandies = candies[ i ];
            } 
        }
        
        List<Boolean> myListToReturn = new ArrayList<>();
        for( int i = 0; i < candies.length; i++ ){
            if(( candies[ i ] + extraCandies ) >= maxCandies ){
                myListToReturn.add( true );
            }
            else{
                myListToReturn.add( false );
            }
        }
        
        return myListToReturn;
    }
}
