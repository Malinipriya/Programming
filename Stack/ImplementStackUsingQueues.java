/*
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
*/
class MyStack 
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) 
    {
        q1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() 
    {
        int size=q1.size();
        while(size>1)
        {
            q2.add(q1.poll());
            size--;
        }
        q1.poll();
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }

    // Get the top element.
    public int top() 
    {
        int size=q1.size();
        while(size>1)
        {
            q2.add(q1.poll());
            size--;
        }
        int element=q1.peek();
        return element;
    }

    // Return whether the stack is empty.
    public boolean empty() 
    {
        if(q1.size()==0 && q2.size()==0)
            return true;
        return false;
    }
}