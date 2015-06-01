//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
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
    public boolean isSymmetric(TreeNode left,TreeNode right) 
    {
        //If both the left and right sub-trees are empty, then the tree is symmetric.
        if(left==null && right==null)
            return true;
        //If both the left and right sub-trees are non-empty, check for the match of the mirror structure and values.
        else if(left!=null && right!=null)
            return left.val==right.val && isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
        //If the mirror structure and values do not match, the tree is not symmetric.
        return false;
    }
    public boolean isSymmetric(TreeNode root) 
    {
        if(root==null)
            return true;
        return isSymmetric(root.left,root.right);
    }
}