/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void allPaths(List<String> ans, String path, TreeNode root){
         if(root.left == null && root.right == null){
            ans.add(path);
            return;
         }
         if(root.left != null){
            allPaths(ans, path+ "->" + root.left.val, root.left);
         }
         if(root.right != null){
            allPaths(ans, path + "->" + root.right.val, root.right);
         }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String path = String.valueOf(root.val);
        if(root == null){
            return ans;
        }
        allPaths(ans, path, root);
        return ans;
    }
}