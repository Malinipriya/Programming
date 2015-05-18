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
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head==null || head.next==null)    
            return head;
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode prev=temp,cur=head;
        while(cur!=null)
        {
            while(cur.next!=null && prev.next.val==cur.next.val)
            {
                cur=cur.next;
            }
            if(prev.next==cur)
                prev=prev.next;
            else
                prev.next=cur.next;
            cur=cur.next;
        }
        return temp.next;
    }
}