class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a = 0; int b = 0;
        int n = grid.length;
        int actualSum = 0; int expectedSum = 0;
        int res[] = new int[2];
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                actualSum +=  grid[i][j]; 
                if(hs.contains(grid[i][j])){
                    a = grid[i][j];
                }
                else{
                    hs.add(grid[i][j]);
                }
            }
        }
        expectedSum = (n*n) * (n*n + 1) / 2;
        b = expectedSum + a - actualSum;
        res[0] = a;
        res[1] = b;    
        return res;
    }
}