/*Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.*/
class MyQueue 
{
    Stack<Integer> first=new Stack<Integer>();
    Stack<Integer> second=new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) 
    {
        first.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() 
    {
        if(second.isEmpty())    
        {
            while(!first.isEmpty())
                second.push(first.pop());
        }
        second.pop();
    }

    // Get the front element.
    public int peek() 
    {
        if(second.isEmpty())    
        {
            while(!first.isEmpty())
                second.push(first.pop());
        }
        return second.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() 
    {
        if(first.isEmpty() && second.isEmpty())
            return true;
        return false;
    }
}