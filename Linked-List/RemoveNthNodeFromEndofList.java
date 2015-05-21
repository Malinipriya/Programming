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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head==null)
            return null;
        ListNode temp=head;
        int list_size=0;
        //Find the length of the link list
        while(temp!=null)
        {
            list_size++;
            temp=temp.next;
        }
        //find the node to be deleted from the first node
        int diff=list_size-n;
        temp=new ListNode(0);
        temp.next=head;
        ListNode prev=temp,cur=head;
        list_size=0;
        //traverse the linked list till the node that is to be deleted is reached.
        while(cur!=null && diff>0)
        {
            cur=cur.next;
            prev=prev.next;
            diff--;
        }
        //remove the required node and return the head of the linked list
        prev.next=cur.next;
        return temp.next;
    }
}