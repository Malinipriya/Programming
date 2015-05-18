/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution 
{
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode cur=head,prev=temp;
        while(cur!=null)
        {
            if(cur.val==val)
            {
                prev.next=cur.next;
                cur=cur.next;
            }
            else
            {
                prev=prev.next;
                cur=cur.next;
            }
        }
        return temp.next;
    }
}