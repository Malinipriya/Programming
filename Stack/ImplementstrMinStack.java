//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
class MinStack extends Stack<Integer>
{
    //We use two stacks.
    //The stack s is used to store only the minimum elements.
    //The default stack is used to store all of the elements including the minimum.
    Stack<Integer> s;
    public MinStack()
    {
        s=new Stack<Integer>();
    }
    public void push(int x) 
    {
        if(x<=getMin())
        {
            s.push(x);
        }
        super.push(x);
    }

    public Integer pop() 
    {
         int value=super.pop();
         if(value==getMin())
         {
             s.pop();
         }
         return value;
    }
    public Integer top() 
    {
        int value=super.peek();
        return value;
    }

    public int getMin() 
    {
        if(s.isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        return s.peek();
    }
}
