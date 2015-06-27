/*Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.*/
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if(l1==null && l2==null)    
            return l1;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode newHead=new ListNode(0);
        ListNode l3=newHead;
        while(l1!=null && l2!=null)
        {
            int min=Math.min(l1.val,l2.val);
            l3.next=new ListNode(min);
            l3=l3.next;
            if(min==l1.val)
                l1=l1.next;
            else
                l2=l2.next;
        }
        if(l1==null)
        {
            while(l2!=null)
            {
                l3.next=new ListNode(l2.val);
                l3=l3.next;
                l2=l2.next;
            }
        }
        if(l2==null)
        {
            while(l1!=null)
            {
                l3.next=new ListNode(l1.val);
                l3=l3.next;
                l1=l1.next;
            }
        }
        return newHead.next;
    }
}