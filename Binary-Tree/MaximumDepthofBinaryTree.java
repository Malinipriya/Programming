//Given a binary tree, find its maximum depth.
//The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
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
    public int maxDepth(TreeNode root) 
    {
        //If the root is null, the maximum depth of the tree is 0.
        if(root==null)    
            return 0;
        //Find the depth of the left and right sub-trees.
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        //Return the maximum of the depth of the left and right sub-trees.
        return Math.max(lh,rh)+1;
    }
}