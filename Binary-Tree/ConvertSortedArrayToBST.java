//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
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
    public TreeNode sortedArrayToBST(int[] nums,int start,int end) 
    {
        if(end<start)
            return null;
        int mid=(start+end)/2;
        //Make the middle element of the array, the root of the tree.
        TreeNode node=new TreeNode(nums[mid]);
        //The values less than the middle element form the left subtree of the root.
        node.left=sortedArrayToBST(nums,start,mid-1);
        //The values greater than the middle element form the right subtree of the root.
        node.right=sortedArrayToBST(nums,mid+1,end);
        //Return the root of the tree.
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        return sortedArrayToBST(nums,0,nums.length-1);
    }
}