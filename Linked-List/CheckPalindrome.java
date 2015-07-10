/*Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?*/

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
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null || head.next==null)
            return true;
        ListNode slow=head,fast=head;
        //Find the middle node of the linked list.
        //If there are even number of nodes in the list,say n nodes, then the middle node will be (n/2)+1th node.
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow;
        if(fast!=null)
            second=slow.next;
        //Reverse the second half of the linked list.
        ListNode cur=second.next,prev=second,temp;
        while(cur!=null)
        {
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        second.next=null;
        second=prev;
        temp=head;
        //Check if the two halves have the same elements.If so,return true. Else,return false.
        while(second!=null)
        {
            if(temp.val!=second.val)
                return false;
            temp=temp.next;
            second=second.next;
        }
        return true;
    }
}