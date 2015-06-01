//Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
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
    public void pathSum(TreeNode root,int sum,List<List<Integer>> result,ArrayList<Integer> list)
    {
        if(root==null)
            return;
        list.add(root.val);
        sum-=root.val;
        //The following condition means that the end of a path is reached and the required sum has been attained.
        //So add the nodes on the path to the final result.
        if(root.left==null && root.right==null && sum==0)
            result.add(new ArrayList<Integer>(list));
        //If the above condition isn't met, go on till the end of a path is reached.
        else
        {
            pathSum(root.left,sum,result,list);
            pathSum(root.right,sum,result,list);
        }
        //Empty the path list each time after it has been added to result.
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) 
    {
         List<List<Integer>> result=new ArrayList<List<Integer>>();
         pathSum(root,sum,result,new ArrayList<Integer>());
         return result;
    }
}