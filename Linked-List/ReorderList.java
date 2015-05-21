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
    //The following function reverses the linked list whose start node is given as an argument.
    public ListNode reverseList(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode prev=head,cur=head.next,temp;
        while(cur!=null)
        {
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        head.next=null;
        return prev;
    }
    public void reorderList(ListNode head) 
    {
        if(head==null || head.next==null)
            return;
        ListNode slow=head,fast=head;
        //Find the middle node of the linked list.
        while(fast!=null && fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        //Excluding the middle node, reverse the second half segment of the linked list.
        ListNode second=slow.next;
        slow.next=null;
        second=reverseList(second);
        //Once one half of the list is reversed, map the nodes and the next pointers appropriately.
        ListNode p1=head,p2=second,temp1,temp2;
        while(p2!=null)
        {
            temp1=p1.next;
            temp2=p2.next;
            p1.next=p2;
            p2.next=temp1;
            p1=temp1;
            p2=temp2;
        }
    }
}