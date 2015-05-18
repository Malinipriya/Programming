/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    ListNode list=null;
    public int countNodes(ListNode head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }
    public TreeNode sortedListToBST(int n)
    {
        if(n<=0)
            return null;
        TreeNode left=sortedListToBST(n/2);
        TreeNode root=new TreeNode(list.val);
        root.left=left;
        list=list.next;
        root.right=sortedListToBST(n-n/2-1);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) 
    {
        list=head;
        int n=countNodes(head);
        return sortedListToBST(n);
    }
}