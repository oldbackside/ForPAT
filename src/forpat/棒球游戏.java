package forpat;

import java.util.Stack;

public class ∞Ù«Ú”Œœ∑ {
	 public int calPoints1(String[] ops) {
		 int sum=0;
		 Stack<Integer> s=new Stack<Integer>();
		 for(int i=0;i<ops.length;i++) {
			 if(ops[i].equals("C")) {
				 sum=sum-s.pop();
			 }
			 else if(ops[i]=="+") {
				 s.add(s.peek()+s.get(s.size()-2));
				 sum=sum+s.peek();
			 }
			 else if(ops[i]=="D") {
				 s.add(2*s.peek());
				 sum=sum+s.peek();
			 }
		     else {
		    	 s.add(Integer.valueOf(ops[i]));
		    	 sum=sum+s.peek();
		     }
		 }
	        return sum;
	  }
	 public int calPoints(String[] ops) {
		 int sum=0;
		 Stack<Integer> s=new Stack<Integer>();
	        for(String t:ops){
	            switch (t){
	                case "+":s.add(s.peek()+s.get(s.size()-2));
					 sum=sum+s.peek();break;
	                case "D":s.add(2*s.peek());
					 sum=sum+s.peek();break;
	                case "C": sum=sum-s.pop();break;
	                default:
	                	s.add(Integer.valueOf(t));
	   		    	 sum=sum+s.peek();
	            }
	        }
	        
	        return sum;
	    }
	 
public static void main(String[] args) {
	String[] d={"5","-2","4","C","D","9","+","+"};
	∞Ù«Ú”Œœ∑ k=new ∞Ù«Ú”Œœ∑();
	System.out.println(k.calPoints(d));
}
}
