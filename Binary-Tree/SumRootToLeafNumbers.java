//Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
//An example is the root-to-leaf path 1->2->3 which represents the number 123.
//Find the total sum of all root-to-leaf numbers.
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
    public void sumNumbers(TreeNode root,int current,int[] sum)
    {
        if(root==null)
            return;
        current=current*10+root.val;
        if(root.left==null && root.right==null)
            sum[0]=sum[0]+current;
        sumNumbers(root.left,current,sum);
        sumNumbers(root.right,current,sum);
    }
    public int sumNumbers(TreeNode root) 
    {
        if(root==null)    
            return 0;
        int[] sum={0};
        int current=0;
        sumNumbers(root,current,sum);
        return sum[0];
    }
}