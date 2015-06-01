//Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        //If the root is empty,return the level order traversal formed.
        if(root==null)
            return result;
        Stack<TreeNode> s1=new Stack<TreeNode>(); 
        Stack<TreeNode> s2=new Stack<TreeNode>();  
        Stack<TreeNode> temp;
        //Use a level variable to keep track of the alternate levels of the tree.
        int level=1;
        //Add the root node to stack #1.
        s1.push(root);
        //Run a loop till stack #1 is empty.
        while(!s1.isEmpty())
        {
            List<Integer> list=new ArrayList<Integer>();
            //Run a loop till the stack #1 becomes empty.
            while(!s1.isEmpty())
            {
                //Remove every node.Add it to the level order traversal list.
                TreeNode n=s1.pop();
                list.add(n.val);
                //If its an odd level,first add its left,then the right sub-tree to the stack #2.
                //If its an even level,first add its right,then the left sub-tree to the Stack #2
                if(level%2!=0)
                {
                    if(n.left!=null)
                        s2.push(n.left);
                    if(n.right!=null)
                        s2.push(n.right);
                }
                else
                {
                    if(n.right!=null)
                        s2.push(n.right);
                    if(n.left!=null)
                        s2.push(n.left);
                }
            }
            //Swap the two stacks. The new contents are now in stack #1. Continue till the end of the tree is reached.
            temp=s1;
            s1=s2;
            s2=temp;
            result.add(list);
            level++;
        }
        return result;
    }
}