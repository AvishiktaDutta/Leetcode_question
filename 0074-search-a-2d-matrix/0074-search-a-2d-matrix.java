class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if(rows == 0) return false; 
        int cols = matrix[0].length;

        int low = 0;
        int high = (rows * cols)-1;
        
        while(low<=high){
            int mid = low + (high - low)/2;

            int midValue = matrix[mid/cols][mid%cols];
            if(midValue == target){
                return true;
            }
            else if(target < midValue){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;

    }
}