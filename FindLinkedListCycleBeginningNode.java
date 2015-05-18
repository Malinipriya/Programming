/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        ListNode slow=head;
        ListNode fast=head;
        //Move both the pointers at a different pace so that they definitely meet a point if there is a cycle.
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        //No cycle detected, do the following
        if(fast==null || fast.next==null)   
            return null;
        //Cycle detected, find the node where the cycle begins
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}