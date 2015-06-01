//Given a binary tree, flatten it to a linked list in-place.
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
    TreeNode newTree=null;
    public void preOrder(TreeNode root)
    {
        //If the root is null, return.
        if(root==null)
            return;
        TreeNode left=null,right=null;
        //Store the left and right nodes of the trees in separate variables.
        if(root.left!=null)
            left=root.left;
        if(root.right!=null)
            right=root.right;
        //Always attach the nodes to the right of the root in newTree.newTree is the newly formed linked list.
        if(newTree!=null)
        {
            newTree.right=root;
        }
        newTree=root;
        newTree.left=null;
        preOrder(left);
        preOrder(right);
    }
    public void flatten(TreeNode root) 
    {
        if(root==null)    
            return;
        preOrder(root);
    }
}