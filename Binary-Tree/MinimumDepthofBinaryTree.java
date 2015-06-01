//Given a binary tree, find its minimum depth.
//The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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
    public int minDepth(TreeNode root) 
    {
        if(root==null)
            return 0;
        //Find the depth of the left and right sub-trees.
        int lh=minDepth(root.left);
        int rh=minDepth(root.right);
        //If the tree has no left sub-tree, then return the depth of the right sub-tree.
        if(lh==0)
            return rh+1;
        //If the tree has no right sub-tree, then return the depth of the left sub-tree.
        if(rh==0)
            return lh+1;
        //Otherwise, return the depth that is the minimum.
        return Math.min(lh,rh)+1;
    }
}