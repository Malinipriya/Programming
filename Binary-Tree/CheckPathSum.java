//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution 
{
    public boolean hasPathSum(TreeNode root, int sum) 
    {
        //If root is null, then the given sum is never attained.
        if(root==null)    
            return false;
        //The following condition means that the end of a path is reached and the required sum has been attained.
        if(root.val==sum && root.left==null && root.right==null)
            return true;
        //If none of the above conditions are met, go on till the end of a path is reached.
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}