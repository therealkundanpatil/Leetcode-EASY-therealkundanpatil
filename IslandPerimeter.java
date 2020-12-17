package easy;

/**
 * LeetCode Easy
 * 
 * Id: 463		Island Perimeter
 * 
 * Time Complexity : O(n2)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int rowSize = grid.length;
        int columnSize = grid[0].length;
        int perimeter = 0;

        for (int i = 0; i < rowSize; ++i) {
            for (int j = 0; j < columnSize; ++j) {
                if (grid[i][j] == 1) {
                    // left Block
                    if ((j - 1) < 0 || grid[i][j - 1] == 0){
                        ++perimeter;    
                    } 

                    // Up Block
                    if ((i - 1) < 0 || grid[i - 1][j] == 0){
                        ++perimeter;    
                    } 

                    // Right Block
                    if ((j + 1) == columnSize || grid[i][j + 1] == 0){
                        ++perimeter;    
                    } 

                    // Down Block
                    if ((i + 1) == rowSize || grid[i + 1][j] == 0){
                        ++perimeter;    
                    } 

                }
            }

        }

        return perimeter;
    }
}
