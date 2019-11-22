package forpat;


import java.util.Stack;

public class ×îÐ¡Õ» {
	class MinStack {
		int min=0x7fffffff;
		Stack<Integer> data=new Stack<Integer>();
		Stack<Integer> m=new Stack<Integer>();
	    public MinStack() {
	    	m.add(min);
	    }
	    
	    public void push(int x) {
	    	if(min>=x) {min=x;m.add(x);}
	        data.add(x);
	    }
	    
	    public void pop() {
	    	if(data.peek()==min) {m.pop();min=m.peek();}
	        data.pop();
	    }
	    
	    public int top() {
	        return data.peek();
	    }
	    
	    public int getMin() {
	    	if(m.size()==1)return 0;
	        return min;
	    }
	}
}
