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
    public ListNode reverseBetween(ListNode head, int m, int n) 
    {
        if(head==null || head.next==null || m==n)
            return head;
        int k=n-m;
        ListNode temp=head,p1=new ListNode(0);
        p1.next=head;
        //Traverse the link list till the m-th node is reached.
        //p1 indicates the node prior to the m-th node.
        //p2 indicates the m-th node.
        while(temp!=null && m>1)
        {
            temp=temp.next;
            p1=p1.next;
            m--;
        }
        ListNode p2=temp,prev=temp,cur=temp.next;
        //Reverse the linked list in place from the m-th node to the n-th node.
        while(cur!=null && k>0)
        {
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
            k--;
        }
        //Map the pointers for the other nodes(the nodes except the ones in positions from m to n) appropriately.
        p2.next=cur;
        if(p1.next!=head)
        {
            p1.next=prev;
            return head;
        }
        return prev;
    }
}