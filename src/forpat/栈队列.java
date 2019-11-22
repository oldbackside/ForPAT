package forpat;

import java.util.Stack;

public class ’ª∂”¡– {
	 /** Initialize your data structure here. */
	class MyQueue{
		Stack<Integer> in;
		Stack<Integer> out;
    public MyQueue() {
        this.in=new Stack<Integer>();
        this.out=new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        in.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(out.isEmpty()) {
        	while(!in.isEmpty()) {
        		out.add(in.pop());
        	}
        }
        return out.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	if(out.isEmpty()) {
        	while(!in.isEmpty()) {
        		out.add(in.pop());
        	}
        }
        return out.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(in.isEmpty()&&out.isEmpty())return true;
        else return false;
    }

	}

}