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
    public ListNode reverseList(ListNode head) 
    {
        if(head==null || head.next==null)    
            return head;
        ListNode prev=head,cur=head.next;
        //Make every node in  the linked list point to the previous node.
        while(cur!=null)
        {
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        //Remove the next pointer of the start node of the linked list.
        head.next=null;
        //Now that every node in the linked list is pointing to the previous node, return the last node of the linked list.
        //Now the linked list has been reversed.
        return prev;
    }
}