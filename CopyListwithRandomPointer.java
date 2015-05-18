/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution 
{
    public RandomListNode copyRandomList(RandomListNode head) 
    {
        if(head==null)
            return head;
        RandomListNode r=head;
        //create a copy of the given list 
        while(r!=null)
        {
            RandomListNode copy=new RandomListNode(r.label);
            copy.next=r.next;
            r.next=copy;
            r=copy.next;
        }
        //copy random pointers from the original list to the copy list
        r=head;
        while(r!=null)
        {
            if(r.random!=null)
                r.next.random=r.random.next;
            r=r.next.next;
        }
        //separate the original list and the copy list
        r=head;
        RandomListNode copyHead=head.next,temp;
        while(r!=null)
        {
            temp=r.next;
            r.next=temp.next;
            if(temp.next!=null)
                temp.next=temp.next.next;
            r=r.next;
        }
        return copyHead;
    }
}