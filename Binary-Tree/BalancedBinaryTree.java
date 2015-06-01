//Given a binary tree, determine if it is height-balanced.
//For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
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
    public int checkHeight(TreeNode root)
    {
        //If the root is null, return 0 because the tree is balanced if it has no nodes.
        if(root==null)
            return 0;
        //Find the height of the left sub tree.If there's no left subtree return -1 because then the tree isn't balanced.
        int leftHeight=checkHeight(root.left);
        if(leftHeight==-1)
            return -1;
        //Find the height of the right sub tree.If there's no right subtree return -1 because then the tree isn't balanced.
        int rightHeight=checkHeight(root.right);
        if(rightHeight==-1)
            return -1;
        //If the left and right subtrees differ by a height of more than 1, return -1 because then the tree isn't balanced.
        int heightDiff=leftHeight-rightHeight;
        if(Math.abs(heightDiff)>1)
            return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
    public boolean isBalanced(TreeNode root) 
    {
        if(checkHeight(root)==-1)
            return false;
        return true;
    }
}