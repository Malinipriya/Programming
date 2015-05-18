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
        //if there is only one element or if there are no elements in the list, there are no duplicates.
        //Hence just return the given list.
        if(head==null || head.next==null)    
            return head;
        ListNode prev=head,curr=head.next;
        while(curr!=null)
        {
            //if duplicates found, remove the duplicates.
            if(prev.val==curr.val)
            {
                prev.next=curr.next;
                curr=curr.next;
            }
            //if no duplicate found, just traverse past the array.
            else
            {
                prev=prev.next;
                curr=curr.next;
            }
        }
        return head;
    }
}