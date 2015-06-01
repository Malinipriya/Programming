//Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        //If the root is empty,return the level order traversal formed.
        if(root==null)
            return result;
        //Add the root node to the queue.
        q.add(root);
        //Run a loop till the queue is empty.
        while(!q.isEmpty())
        {
            int len=q.size();
            List<Integer> list=new ArrayList<Integer>();
            //Run a loop till the size of the queue.
            //Remove every node.Add it to the level order traversal list.
            //Add its left and right sub-trees to the queue.
            for(int i=0;i<len;i++)
            {
                TreeNode n=q.poll();
                list.add(n.val);
                if(n.left!=null)
                    q.add(n.left);
                if(n.right!=null)
                    q.add(n.right);
            }
            //Every time add the list to the first index of the level order traversal so that the root is at the bottom of the list. 
            //The list contains the nodes of the tree in the reverse order of its levels(bottom up).
            result.add(0,list);
        }
        return result;
    }
}