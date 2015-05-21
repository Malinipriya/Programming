/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public int getLength(ListNode head)
    {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA==null || headB==null)    
            return null;
        //Find the length of the two given lists
        int lenA=getLength(headA);
        int lenB=getLength(headB);
        int diff=lenA-lenB;
        //if the second list is longer than the first list, swap the two lists.
        //This is just to make sure that the first list is always the longer one.
        if(diff<0)
        {
            ListNode temp=headA;
            int len=lenA;
            headA=headB;
            lenA=lenB;
            headB=temp;
            lenB=len;
        }
        //traverse the longer list till the point when both the lists become equal in size
        diff=Math.abs(diff);
        while(diff>0)
        {
            headA=headA.next;
            diff--;
        }
        //now move the headA and headB pointers in the same pace.
        //Since the lists are of the same size, they'll definitely meet at the point of intersection.
        while(headA!=null)
        {
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}