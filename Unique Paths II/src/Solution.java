public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    			
    	if (m > 100 || n > 100) return 0;
    	int dp[][] = new int[m][n];
    	dp[0][0] = 1;
    	for (int i = 0; i < m; i++)
    		dp[i][0] = 1;
    	for (int i = 0; i < n; i++)
    		dp[0][i] = 1;
    	for (int i = 1; i < m; i++)
    		for (int j = 1; j < n; j++)
    			dp[i][j] = dp[i -1][j] + dp[i][j-1];
    	return dp[m-1][n-1];
    }

    public static void main(String[] args) {
    	
    	int A[3][3] = {{0,0,0},{1,1,1},{2,3,4}};
    	
    	System.out.println(new Solution().uniquePathsWithObstacles(A));
		
	}
}
